package com.lonczynski.config.aws;

import com.lonczynski.config.AppConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SqsAwsConfig {

    SqsClient sqsClient;

    private final AppConfig appConfig;

    public SqsAwsConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Bean
    public SqsClient getSqsClient() {
        sqsClient = SqsClient.builder()
                .build();

        createQueuesIfNotCreatedYet();

        return sqsClient;
    }

    void createQueuesIfNotCreatedYet() {
        try {
            String queueName = appConfig.getQueueName();

            String fifoQueueUrl = createFifoQueue(queueName + ".fifo");
            String deadLetterQueueUrl = createDeadLetterQueue(queueName + "-dlq.fifo");

            String deadLetterQueueARN = getDeadLetterQueueArn(deadLetterQueueUrl);

            setDeadLetterQueueToStandardQueue(fifoQueueUrl, deadLetterQueueARN);

        } catch (SqsException e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            throw e;
        }
    }

    /**
     * FIFO Queue
     */

    private String createFifoQueue(String queueName) {
        CreateQueueRequest createQueueRequest = CreateQueueRequest.builder()
                .attributes(getQueueAttributeNames())
                .queueName(queueName)
                .build();

        return sqsClient.createQueue(createQueueRequest).queueUrl();
    }

    private void setDeadLetterQueueToStandardQueue(String standardQueueUrl, String deadLetterQueueARN) {
        HashMap map = new HashMap<QueueAttributeName, String>();
        map.put(QueueAttributeName.REDRIVE_POLICY, "{\"maxReceiveCount\":\"10\", " + "\"deadLetterTargetArn\":\"" + deadLetterQueueARN + "\"}");
        SetQueueAttributesRequest request = SetQueueAttributesRequest.builder()
                .queueUrl(standardQueueUrl)
                .attributes(map)
                .build();

        sqsClient.setQueueAttributes(request);
    }

    /**
     * Dead Letter Queue
     */

    private String createDeadLetterQueue(String queueName) {
        CreateQueueRequest dlCreateQueueRequest = CreateQueueRequest.builder()
                .queueName(queueName)
                .attributes(getQueueAttributeNames())
                .build();
        return sqsClient.createQueue(dlCreateQueueRequest).queueUrl();
    }

    private String getDeadLetterQueueArn(String deadLetterQueueUrl) {
        GetQueueAttributesResponse deadQueueAttributes = sqsClient.getQueueAttributes(
                GetQueueAttributesRequest.builder()
                        .queueUrl(deadLetterQueueUrl)
                        .attributeNamesWithStrings("QueueArn")
                        .build());

        return deadQueueAttributes.attributes().get(QueueAttributeName.QUEUE_ARN);
    }

    /**
     * Queues config
     */

    private Map<QueueAttributeName, String> getQueueAttributeNames() {
        Map<QueueAttributeName, String> attributes = new HashMap<QueueAttributeName, String>();
        attributes.put(QueueAttributeName.MESSAGE_RETENTION_PERIOD, "345600");
        attributes.put(QueueAttributeName.FIFO_QUEUE, "true");
        attributes.put(QueueAttributeName.CONTENT_BASED_DEDUPLICATION, "false");

        // Enables high throughput FIFO queue
        attributes.put(QueueAttributeName.DEDUPLICATION_SCOPE, "messageGroup");
        attributes.put(QueueAttributeName.FIFO_THROUGHPUT_LIMIT, "perMessageGroupId");
        return attributes;
    }
}

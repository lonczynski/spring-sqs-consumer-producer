package br.com.lonczynski.resource;

import br.com.lonczynski.config.AppConfig;
import br.com.lonczynski.transformer.SampleTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class IntegratorProducer extends RouteBuilder {
	private final AppConfig appConfig;

	public IntegratorProducer(AppConfig appConfig) {
		this.appConfig = appConfig;
	}

	@Override
	public void configure() {
		fromF("direct:sampleController")
			.bean(SampleTransformer.class, "doTransform")
			.log(String.format("Generated value to SQS: ${body}"))
			.setProperty("CamelAwsMessageGroupId", constant("sample-group"))
			.to("aws2-sqs://" + appConfig.getQueueName() + ".fifo?autoCreateQueue=false&messageGroupIdStrategy=usePropertyValue");
	}
}

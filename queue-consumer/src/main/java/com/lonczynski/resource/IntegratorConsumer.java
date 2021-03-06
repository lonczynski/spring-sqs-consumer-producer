/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lonczynski.resource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lonczynski.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * https://camel.apache.org/components/3.16.x/aws2-sqs-component.html
 * https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-sqs-long-polling.html
 */
@Slf4j
@Component
public class IntegratorConsumer extends RouteBuilder {

	@Autowired
	AppConfig appConfig;

	@Override
	public void configure() {
		String queueName = appConfig.getQueueName() + ".fifo";

		from("aws2-sqs://" + queueName + "?concurrentConsumers=2&autoCreateQueue=false&waitTimeSeconds=20")
			.process(exchange -> {
				ObjectMapper mapper = new ObjectMapper();

				try {
					JsonNode json = mapper.readTree(exchange.getMessage().getBody().toString());

//					String fieldA = json.get("fieldA").asText();
//					String fieldB = json.get("fielb").asText();

					log.info("CONSUMED from <<< " + queueName + " | " + json);
				}
				/**
				 * Caso haja qualquer problema durante o consumo da mensagem de integra????o e uma exce????o for gerada
				 * o Apache Camel n??o envia o acknowledge para a fila.
				 * Ou seja, ao gerar uma exce????o o dado n??o ?? consumido da fila.
				 */
				catch(Exception e) {
					log.error(e.getMessage(), e);

					throw new RuntimeException(e);
				}
			});
	}
}

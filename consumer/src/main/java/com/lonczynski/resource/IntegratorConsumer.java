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

//		from("aws2-sqs://" + queueName + "?concurrentConsumers=2&autoCreateQueue=false&waitTimeSeconds=20")
//			.process(exchange -> {
//				ObjectMapper mapper = new ObjectMapper();
//
//				try {
//					JsonNode json = mapper.readTree(exchange.getMessage().getBody().toString());
//
//					String routine = json.get("routine").asText();
//					String microService = json.get("microService").asText();
//					ArrayNode content = (ArrayNode) json.get("content");
//
//					log.info("CONSUMED from <<< " + queueName + " | microservice:" + microService + " routine:" + routine + " content:" + content);
//
//					MicroServiceEnum microServiceEnum = MicroServiceEnum.fromString(microService);
//					PrescricaoRoutineEnum prescricaoRoutineEnum = PrescricaoRoutineEnum.fromString(routine);
//
//					if (microServiceEnum == null || prescricaoRoutineEnum == null)
//						throw new Exception("Mensagem recebida da fila não contém todos parametros necessários");
//
//					switch (microServiceEnum) {
//						case Prescricao:
//							switch (prescricaoRoutineEnum) {
//								case DadosPaciente:
//									// chama transformer de prescricao dados paciente
//									//SUBSTITUIR PELOS TRANSFORMERS QUE FOREM ATUALIZAR O BANCO COM O DADO DE UPDATE OU DE OUTRAS ROTINAS
//
//									break;
//								case DadosPrescricao:
//									// chama transformer de prescricao dados prescricao
//									//SUBSTITUIR PELOS TRANSFORMERS QUE FOREM ATUALIZAR O BANCO COM O DADO DE UPDATE OU DE OUTRAS ROTINAS
//
//									break;
//							}
//					}
//				}
//				/**
//				 * Caso haja qualquer problema durante o consumo da mensagem de integração e uma exceção for gerada
//				 * o Apache Camel não envia o acknowledge para a fila.
//				 * Ou seja, ao gerar uma exceção o dado não é consumido da fila.
//				 */
//				catch(Exception e) {
//					log.error(e.getMessage(), e);
//
//					throw new RuntimeException(e);
//				}
//			});
	}
}

package com.lonczynski.resource;

import com.lonczynski.config.AppConfig;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class IntegratorProducer extends RouteBuilder {
	Logger logger = LoggerFactory.getLogger(IntegratorProducer.class);

	private final AppConfig appConfig;

	public IntegratorProducer(AppConfig appConfig) {
		this.appConfig = appConfig;
	}

	@Override
	public void configure() {
		/*
			Definir aqui cada fluxo de scheduler novo que for criado.
			Ao definir um novo scheduler com setupScheduler automaticamente os dados da query serão enviados para a fila de integração
				do cliente.
		 */

//		setupScheduler(MicroServiceEnum.Prescricao, PrescricaoRoutineEnum.DadosPaciente, DadosPacienteTransformer.class);
//		setupScheduler(MicroServiceEnum.Prescricao, PrescricaoRoutineEnum.DadosPrescricao, DadosPrescricaoTransformer.class);
	}

//	<T> void setupScheduler(MicroServiceEnum microService, EnumDescription routine, Class<T> transformerClass) {
//		// mybatis
//		final String scheduler = "&scheduler=spring&scheduler.timeZone=America/Sao_Paulo&scheduler.cron=" + appConfig.getScheduler().getCronExpr();
//		final String updateOnConsume = "";
//		final String useList = "&useIterator=false";
//		final String keepGoing = "&greedy=false";
//
//		// SQS
//		final String messageGroupIdStrategy = "&messageGroupIdStrategy=usePropertyValue";
//
//		fromF("mybatis:consume-%s?statementType=SelectList" + scheduler + updateOnConsume + useList + keepGoing, routine.getDescription(), routine.getDescription())
//				.routeId("SCHEDULER_SQL_" + routine.getDescription())
//				.bean(transformerClass, "doTransform")
//				.bean(BaseTransformer.class, "getMessageJson(*, " + routine.getDescription() + ", " + appConfig.getTenant() + ", " + appConfig.getSubtenantId() + ")")
//				.log(String.format("PRODUCED to >>> " + QUEUE_NAME_PREFIX_INTEGRATOR + microService.description + ".fifo" + " | microservice:" + microService.description + " routine:" + routine.getDescription() + " content:${body}", "table_name"))
//				// separa as filas em grupos, para obter mensagens assincronamente entre subtenants
//				.setProperty("CamelAwsMessageGroupId", constant(appConfig.getTenant() + "_" +  appConfig.getSubtenantId()))
//				.to("aws2-sqs://" + QUEUE_NAME_PREFIX_INTEGRATOR + microService.description + ".fifo?autoCreateQueue=false" + messageGroupIdStrategy);
//	}
}

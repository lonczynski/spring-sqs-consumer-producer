package br.com.lonczynski.controller;

import br.com.lonczynski.SampleModel;
import lombok.RequiredArgsConstructor;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.support.DefaultExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.inject.Inject;

@RestController
@RequestMapping("/samples")
public class SampleController {
    @Produce("direct:sampleController")
    private final ProducerTemplate producerTemplate;
    private final CamelContext context;

    @Autowired
    public SampleController(
            ProducerTemplate producerTemplate, CamelContext context
    ) {
        this.producerTemplate = producerTemplate;
        this.context = context;
    }

    @PostMapping()
    public ResponseEntity createUsagePlan(@RequestBody SampleModel model) {
        Exchange exchange = new DefaultExchange(context);
        producerTemplate.requestBody(model);
        producerTemplate.send(exchange);

        return ResponseEntity.ok().build();
    }
}

package br.com.lonczynski.controller;

import br.com.lonczynski.SampleModel;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samples")
public class SampleController {
    @Produce("direct:sampleController")
    private final ProducerTemplate producerTemplate;

    @Autowired
    public SampleController(
            ProducerTemplate producerTemplate
    ) {
        this.producerTemplate = producerTemplate;
    }

    @PostMapping()
    public ResponseEntity createUsagePlan(@RequestBody SampleModel model) {
        producerTemplate.requestBody(model);

        return ResponseEntity.ok().build();
    }
}

package br.com.lonczynski.transformer;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;

public class SampleTransformer extends BaseTransformer {
    @Bean
    public List<String> doTransform(List<HashMap> hashMapList) {
        return List.of("teste");
    }
}

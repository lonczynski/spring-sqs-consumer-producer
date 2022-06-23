package com.lonczynski.transformer.prescricao;

import com.lonczynski.transformer.BaseTransformer;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;

public class DadosPacienteTransformer extends BaseTransformer {
    @Bean
    public List<String> doTransform(List<HashMap> hashMapList) {
        return List.of("teste");
    }
}

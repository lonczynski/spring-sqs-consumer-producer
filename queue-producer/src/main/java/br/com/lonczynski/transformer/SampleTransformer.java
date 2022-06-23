package br.com.lonczynski.transformer;

import br.com.lonczynski.SampleModel;
import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;

public class SampleTransformer {
    @Bean
    public String doTransform(SampleModel model) {
        return new Gson().toJson(model);
    }
}

package com.lonczynski.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private Scheduler scheduler;
    private String queueName;

    @Data
    public static class Scheduler {
        private String limitQuery;
        private String cronExpr;
    }
}

package com.dimfunky.kafkaconfig;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "producer")
public class KafkaProducerProperties {

    @Valid
    private Topic topic;

    @Data
    public static class Topic {
        @Valid
        private Order order;

        @Data
        public static class Order {
            @NotBlank
            private String create;
            @NotBlank
            private String cancel;
        }
    }

}

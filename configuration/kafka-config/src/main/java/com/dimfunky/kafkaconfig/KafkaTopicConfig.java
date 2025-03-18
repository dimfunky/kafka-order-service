package com.dimfunky.kafkaconfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@EnableConfigurationProperties(KafkaProducerProperties.class)
public class KafkaTopicConfig {

    @Bean
    public NewTopic createOrderRequest(final KafkaProducerProperties kafkaProducerProperties) {
        return TopicBuilder.name(kafkaProducerProperties.getTopic().getOrder().getCreate()).build();
    }

    @Bean
    public NewTopic cancelOrderRequest(final KafkaProducerProperties kafkaProducerProperties) {
        return TopicBuilder.name(kafkaProducerProperties.getTopic().getOrder().getCancel()).build();
    }
}

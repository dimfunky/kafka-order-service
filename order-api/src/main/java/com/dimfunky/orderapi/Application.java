package com.dimfunky.orderapi;

import com.dimfunky.kafkaconfig.KafkaProducerConfig;
import com.dimfunky.kafkaconfig.KafkaTopicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({KafkaProducerConfig.class, KafkaTopicConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

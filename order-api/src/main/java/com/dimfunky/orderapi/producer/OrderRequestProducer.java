package com.dimfunky.orderapi.producer;

import com.dimfunky.kafkaconfig.KafkaProducerProperties;
import com.dimfunky.commons.dto.CancelOrderRequest;
import com.dimfunky.commons.dto.CreateOrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderRequestProducer {
    private final KafkaProducerProperties producerProperties;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void produceCreateOrder(final CreateOrderRequest createOrderRequest) {
        kafkaTemplate.send(producerProperties.getTopic().getOrder().getCreate(), createOrderRequest);
    }

    public void produceCancelOrder(final CancelOrderRequest cancelOrderRequest) {
        kafkaTemplate.send(producerProperties.getTopic().getOrder().getCancel(), cancelOrderRequest);
    }
}

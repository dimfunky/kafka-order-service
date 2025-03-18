package com.dimfunky.orderapi.service;

import com.dimfunky.orderapi.dto.CancelOrderRequest;
import com.dimfunky.orderapi.dto.CreateOrderRequest;
import com.dimfunky.orderapi.producer.OrderRequestProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRequestProducer producer;

    public void createOrder(final CreateOrderRequest createOrderRequest) {
        producer.produceCreateOrder(createOrderRequest);
    }

    public void cancelOrder(final CancelOrderRequest cancelOrderRequest) {
        producer.produceCancelOrder(cancelOrderRequest);
    }
}

package com.dimfunky.orderapi.controller;

import com.dimfunky.commons.dto.CancelOrderRequest;
import com.dimfunky.commons.dto.CreateOrderRequest;
import com.dimfunky.orderapi.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/create")
    public void createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        log.info("Received CreateOrderRequest: {}", createOrderRequest);
        orderService.createOrder(createOrderRequest);
    }

    @PostMapping("/cancel")
    public void cancelOrder(@RequestBody CancelOrderRequest cancelOrderRequest) {
        log.info("Received CancelOrderRequest: {}", cancelOrderRequest);
        orderService.cancelOrder(cancelOrderRequest);
    }
}

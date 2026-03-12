package com.truper.controller;

import com.truper.entity.Order;
import com.truper.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/v1/order")
public class OrderController {

    private OrderService orderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        log.info(order.toString());
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getById(id);
    }

}

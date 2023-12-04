package com.example.orderdemo.controller;

import com.example.orderdemo.data.Order;
import com.example.orderdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(path="/orders")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @PutMapping(path="/orders")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    @GetMapping(path="/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @DeleteMapping(path="/orders/{id}")
    public void deleteOrderById(@PathVariable int id){
        orderService.deleteOrderById(id);
    }

}

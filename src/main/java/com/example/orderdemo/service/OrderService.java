package com.example.orderdemo.service;

import com.example.orderdemo.data.Order;
import com.example.orderdemo.data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public void deleteOrderById(int id){
        orderRepository.deleteById(id);
    }
}

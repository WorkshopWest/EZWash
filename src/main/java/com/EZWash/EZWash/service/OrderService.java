package com.EZWash.EZWash.service;

import com.EZWash.EZWash.model.Order;
import com.EZWash.EZWash.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

@Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }
    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }
    public void deleteOrderById(Long id){
        orderRepository.deleteOrderById(id);
    }
    public void deleteOrder(Order order){
        orderRepository.delete(order);
    }
}

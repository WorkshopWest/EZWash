package com.EZWash.EZWash.OrderResource;

import com.EZWash.EZWash.model.Order;
import com.EZWash.EZWash.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderResource {
    private final OrderService orderService;

    @Autowired
    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> orders = orderService.findAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        Order newOrder = orderService.addOrder(order);
        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrderById(@PathVariable Long id){
        orderService.deleteOrderById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteOrder(@RequestBody Order order){
        orderService.deleteOrder(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

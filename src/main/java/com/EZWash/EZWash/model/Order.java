package com.EZWash.EZWash.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customer;
    private Double orderWeight;
    private LocalDateTime collectionTime;
    private String orderStatus;

    public Order(String customer, Double orderWeight, LocalDateTime collectionTime, String orderStatus) {

        this.customer = customer;
        this.orderWeight = orderWeight;
        this.collectionTime = collectionTime;
        this.orderStatus = orderStatus;
    }

    public Order() {

    }
}

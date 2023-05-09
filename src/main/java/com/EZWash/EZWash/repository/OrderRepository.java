package com.EZWash.EZWash.repository;

import com.EZWash.EZWash.model.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Transactional
    void deleteOrderById(Long id);
}

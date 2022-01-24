package com.abc.orderservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.orderservices.dao.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}

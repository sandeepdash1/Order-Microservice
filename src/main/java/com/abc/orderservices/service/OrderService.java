package com.abc.orderservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.orderservices.dao.Order;
import com.abc.orderservices.repository.OrderRepo;

@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;

	public Order addOrder(Order orderreq) {
		return orderRepo.save(orderreq);
	}

	public Optional<Order> getOrderById(long id) {
		return orderRepo.findById(id);
	}

	public void deleteById(long id) {
		orderRepo.deleteById(id);
		
	}

}

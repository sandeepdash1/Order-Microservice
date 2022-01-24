package com.abc.orderservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.orderservices.dao.Order;
import com.abc.orderservices.service.OrderService;

@RestController
@RequestMapping("/orderService")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping("/addOrder")
	public Order addOrder(@PathVariable Order orderreq) {
		return orderService.addOrder(orderreq);
		
	}
	
	@GetMapping("/getOrder/{id}")
	public Optional<Order> getOrderById(@PathVariable long id) {
		return orderService.getOrderById(id);
		
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public String deleteById(@PathVariable long id) {
		orderService.deleteById(id);
		return "Oreder Deleted Successfully.....";
		
	}
}

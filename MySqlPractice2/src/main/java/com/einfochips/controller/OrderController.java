package com.einfochips.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.model.Address;
import com.einfochips.model.Orders;
import com.einfochips.repo.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping("/insert")
	public String insertOrder()
	{
		Orders orders = new Orders();
		orders.setOderTrakingNumber("abc123");
		orders.setStatus("pending");
		orders.setTotalPrice(new BigDecimal(123));
		orders.setTotalQuantity(5);
		
		Address address= new Address();
		address.setCity("nadiad");
		address.setState("gujarat");
		address.setCountry("india");
		
		orders.setAddress(address);
		
		orderRepository.save(orders);
		
		return"inserted!....";
	}

}

package com.einfochips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.model.Laptop;
import com.einfochips.repository.LaptopRepository;

@RestController
public class laptopController {
	
	@Autowired
	private LaptopRepository laptopRepository;
	
//    @GetMapping("/getLaptop")
//	public List<Laptop> getLaptop()
//	{
//	   return laptopRepository.findAll(); 
//	}

}

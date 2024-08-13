package com.einfochips.jwt.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.jwt.model.Product;
import com.einfochips.jwt.repo.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepo  productRepo;
	
	@RequestMapping("/test")
	public String getTest()
	{
		LocalDate purchageDate = LocalDate.of(2023, 6, 21); 
		Date produceDate= new Date();
		java.util.Date saleDate= new java.util.Date(System.currentTimeMillis());
		return "testing 1 purchageDate ="+purchageDate+" 2 produceDate = "+produceDate.getYear()+"3 saleDate"+saleDate.compareTo(produceDate)+"";
	}
	
	@GetMapping("/addProductDetails")
	public String addProductDeatils()
	
	{
		LocalDate purchageDate = LocalDate.of(2023, 6, 24); 
		Date produceDate= new Date();
		java.util.Date saleDate= new java.util.Date(System.currentTimeMillis());
		productRepo.save(new Product("mobile",20l,purchageDate,produceDate,saleDate));
		return "ok";
	}

}

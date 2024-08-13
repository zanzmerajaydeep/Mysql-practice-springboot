package com.einfochips.dto;

import java.util.List;

import com.einfochips.model.Laptop;
import com.einfochips.model.Product;

import lombok.Data;

@Data
public class RequestResponse {
	

	private int id;
	
	
	private String name;
	
	
	private String about;
	
	
	private Laptop laptop;
	
	
	private List<Product> product;

}

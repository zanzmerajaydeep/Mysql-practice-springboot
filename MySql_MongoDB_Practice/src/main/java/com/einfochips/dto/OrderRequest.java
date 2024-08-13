package com.einfochips.dto;

import java.util.List;

import com.einfochips.model.Laptop;
import com.einfochips.model.Product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class OrderRequest {
	
	
	
	private int id;
	
	@NotNull
	private String name;
	
	@Size(min = 2,max = 10)
	private String about;
	
	
	private Laptop laptop;
	
	
	private List<Product> product;
	
	




	
}

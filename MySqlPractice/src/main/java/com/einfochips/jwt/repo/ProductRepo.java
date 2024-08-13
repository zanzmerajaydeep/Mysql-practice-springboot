package com.einfochips.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.jwt.model.Product;


public interface ProductRepo  extends JpaRepository<Product, Integer>{

	

}

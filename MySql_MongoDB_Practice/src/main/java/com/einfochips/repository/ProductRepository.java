package com.einfochips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

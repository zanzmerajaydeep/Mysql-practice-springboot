package com.einfochips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.model.Laptop;

public interface LaptopRepository  extends JpaRepository<Laptop, Integer>{

}

package com.einfochips.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.model.Orders;

public interface OrderRepository extends JpaRepository<Orders,Long> {

}

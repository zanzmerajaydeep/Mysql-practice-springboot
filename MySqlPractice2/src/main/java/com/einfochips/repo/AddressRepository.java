package com.einfochips.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.model.Address;

public interface AddressRepository  extends JpaRepository<Address , Long>{

}

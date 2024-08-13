package com.einfochips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfochips.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{
	
	

}

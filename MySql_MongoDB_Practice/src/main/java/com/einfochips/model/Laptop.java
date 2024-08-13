package com.einfochips.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jpa_laptop")
public class Laptop {

	@Id
	private int id;
	private String name;
	private String model;
	
	@OneToOne
	@JoinColumn( name = "student_id")
	private Student student;
	
	

	public Laptop() {
		super();
		
	}
	
	
	
	
	
}  

package com.einfochips.model;




import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
@Table(name = "jpa_student")
public class Student {
	
	@Id
	private int id;
	
	@NotNull(message = "name must be their!...")
	private String name;
	
	@Size(min = 2,max = 10,message = "about is beet ween 2 to 10!....")
	private String about;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Student_id")
	private List<Product> product;

	
	

	public Student() {
		super();
		
	}
	
	
	
	
	
	
	

	
	
	
	
	

	

}

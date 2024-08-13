package com.einfochips.exception;

public class DataNotFoundWithId  extends RuntimeException{

	public DataNotFoundWithId(int id) {
		super("Student not found with ID : "+id);
		
	}

	

}

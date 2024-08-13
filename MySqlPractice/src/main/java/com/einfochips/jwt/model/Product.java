package com.einfochips.jwt.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.cglib.core.Local;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private int id;
	
	@Column(name = "Product_Name" ,nullable = false)
	private String pName;
	
	private Long qty;
	
	private LocalDate DateOfPurchase;
	
	private Date DateOfproduce;
	
	private Date DateOfSale;
	
	
	public Product(String pName, Long i, LocalDate dateOfPurchase, Date dateOfproduce, Date saleDate) {
		super();
		this.pName = pName;
		this.qty = i;
		DateOfPurchase = dateOfPurchase;
		DateOfproduce = dateOfproduce;
		DateOfSale = saleDate;
	}
	public int getId() {
		return id;
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public LocalDate getDateOfPurchase() {
		return DateOfPurchase;
	}
	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		DateOfPurchase = dateOfPurchase;
	}
	public Date getDateOfproduce() {
		return DateOfproduce;
	}
	public void setDateOfproduce(Date dateOfproduce) {
		DateOfproduce = dateOfproduce;
	}
	public java.sql.Date getDateOfSale() {
		return (java.sql.Date) DateOfSale;
	}
	public void setDateOfSale(java.sql.Date dateOfSale) {
		DateOfSale = dateOfSale;
	}
	public Product(int id, String pName, Long qty, LocalDate dateOfPurchase, Date dateOfproduce,
			java.sql.Date dateOfSale) {
		super();
		this.id = id;
		this.pName = pName;
		this.qty = qty;
		DateOfPurchase = dateOfPurchase;
		DateOfproduce = dateOfproduce;
		DateOfSale = dateOfSale;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", qty=" + qty + ", DateOfPurchase=" + DateOfPurchase
				+ ", DateOfproduce=" + DateOfproduce + ", DateOfSale=" + DateOfSale + "]";
	}
	public Product() {
		super();
	}
	
	
	
	

}

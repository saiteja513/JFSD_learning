package com.example.pct.pct.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pro_id;
	private String pro_name;
	private Double price;
	private String brand;
	private String pro_link;
		
	public Products() {
		super();
	}

	public Products(Long pro_id, String pro_name, Double price, String brand, String pro_link) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.price = price;
		this.brand = brand;
		this.pro_link = pro_link;
	}
	public Long getPro_id() {
		return pro_id;
	}
	public void setPro_id(Long pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPro_link() {
		return pro_link;
	}
	public void setPro_link(String pro_link) {
		this.pro_link = pro_link;
	}
	@Override
	public String toString() {
		return "Products [pro_id=" + pro_id + ", pro_name=" + pro_name + ", price=" + price + ", brand=" + brand
				+ ", pro_link=" + pro_link + "]";
	}
	
	
}

package com.spring.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int id;
public String name;
public String brand;
public String madein;
public float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMadein() {
	return madein;
}
public void setMadein(String madein) {
	this.madein = madein;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product(int id, String name, String brand, String madein, float price) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.madein = madein;
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", madein=" + madein + ", price=" + price
			+ "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
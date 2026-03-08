package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_category")
	private String category;

	@Column(name = "product_price")
	private double price;

	public Product() {
	}

	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

}
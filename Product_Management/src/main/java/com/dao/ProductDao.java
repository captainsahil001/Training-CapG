package com.dao;

import java.util.List;
import com.entity.Product;

public interface ProductDao {

	void addProduct(Product p);

	List<Product> viewProducts();

	void updatePrice(int id, String name, double price);

	void deleteProduct(int id);

	List<Product> displayByCategory(String category);

}
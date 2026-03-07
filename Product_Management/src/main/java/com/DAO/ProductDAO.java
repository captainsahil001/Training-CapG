package com.DAO;


public interface ProductDAO {

    void addProduct();

    void viewProducts();

    void updatePrice(int id,String name,double price);

    void deleteProduct(int id);

    void displayByCategory(String category);
}

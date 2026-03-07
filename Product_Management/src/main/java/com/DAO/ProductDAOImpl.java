package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.entity.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {

	SessionFactory factory;

	public ProductDAOImpl() {
		factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
	}

	public void addProduct() {

		Session session = factory.openSession();
		session.beginTransaction();

		Product p = new Product("Laptop", "Electronics", 70000);

		session.save(p);

		session.getTransaction().commit();
		session.close();

		System.out.println("Product Added");
	}

	public void viewProducts() {

		Session session = factory.openSession();

		List<Product> list = session.createQuery("from Product", Product.class).list();

		for (Product p : list)
			System.out.println(p);

		session.close();
	}

	public void updatePrice(int id, String name, double price) {

		Session session = factory.openSession();
		session.beginTransaction();

		Product p = session.get(Product.class, id);

		if (p != null && p.getProductName().equals(name)) {
			p.setPrice(price);
			session.update(p);
		}

		session.getTransaction().commit();
		session.close();
	}

	public void deleteProduct(int id) {

		Session session = factory.openSession();
		session.beginTransaction();

		Product p = session.get(Product.class, id);

		if (p != null)
			session.delete(p);

		session.getTransaction().commit();
		session.close();
	}

	public void displayByCategory(String category) {

		Session session = factory.openSession();

		List<Product> list = session.createQuery("from Product where category=:c", Product.class)
				.setParameter("c", category).list();

		for (Product p : list)
			System.out.println(p);

		session.close();
	}
}
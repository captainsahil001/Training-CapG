package com.dao;

import java.util.List;
import javax.persistence.*;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.entity.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;

	public void addProduct(Product p) {
		em.persist(p);
	}

	public List<Product> viewProducts() {
		return em.createQuery("from Product", Product.class).getResultList();
	}

	public void updatePrice(int id, String name, double price) {

		em.createQuery("update Product set price=:p where id=:i and name=:n").setParameter("p", price)
				.setParameter("i", id).setParameter("n", name).executeUpdate();
	}

	public void deleteProduct(int id) {

		em.createQuery("delete from Product where id=:i").setParameter("i", id).executeUpdate();
	}

	public List<Product> displayByCategory(String category) {

		return em.createQuery("from Product where category=:c", Product.class).setParameter("c", category)
				.getResultList();

	}

}
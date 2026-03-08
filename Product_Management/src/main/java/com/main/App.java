package com.main;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.AppConfig;
import com.dao.ProductDao;
import com.entity.Product;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductDao dao = context.getBean(ProductDao.class);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1 Add Product");
			System.out.println("2 View Products");
			System.out.println("3 Update Price");
			System.out.println("4 Delete Product");
			System.out.println("5 Display by Category");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:

				System.out.println("Enter name category price");

				dao.addProduct(new Product(sc.next(), sc.next(), sc.nextDouble()));

				break;

			case 2:

				dao.viewProducts().forEach(p -> System.out
						.println(p.getId() + " " + p.getName() + " " + p.getCategory() + " " + p.getPrice()));

				break;

			case 3:

				System.out.println("Enter id name new price");

				dao.updatePrice(sc.nextInt(), sc.next(), sc.nextDouble());

				break;

			case 4:

				System.out.println("Enter id");

				dao.deleteProduct(sc.nextInt());

				break;

			case 5:

				System.out.println("Enter category");

				dao.displayByCategory(sc.next()).forEach(p -> System.out
						.println(p.getId() + " " + p.getName() + " " + p.getCategory() + " " + p.getPrice()));

			}
		}

	}
}
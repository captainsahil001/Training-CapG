package com;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.DAO.ProductDAO;
import com.config.AppConfig;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ProductDAO dao = (ProductDAO) (context.getBean("productDAO"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n------ PRODUCT MANAGEMENT SYSTEM ------");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product Price");
            System.out.println("4. Delete Product");
            System.out.println("5. Display Product by Category");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    dao.addProduct();
                    break;

                case 2:
                    dao.viewProducts();
                    break;

                case 3:
                    System.out.println("Enter Product ID:");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter Product Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter New Price:");
                    double price = sc.nextDouble();

                    dao.updatePrice(id, name, price);
                    break;

                case 4:
                    System.out.println("Enter Product ID to delete:");
                    int deleteId = sc.nextInt();

                    dao.deleteProduct(deleteId);
                    break;

                case 5:
                    sc.nextLine();

                    System.out.println("Enter Category:");
                    String category = sc.nextLine();

                    dao.displayByCategory(category);
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}

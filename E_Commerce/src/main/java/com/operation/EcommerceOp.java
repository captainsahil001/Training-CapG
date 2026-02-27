package com.operation;

import java.util.Scanner;
import java.sql.*;

public class EcommerceOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operation:");
        System.out.println("1. Insert Data");
        System.out.println("2. Update Customer Email");
        System.out.println("3. Delete Cart");
        int choice = sc.nextInt();

        try {
            /* 1. Load Driver */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /* 2. Create Connection */
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=sahil007");
            System.out.println("Connection successfully...");

            switch (choice) {

                // ===================== INSERT =====================
                case 1:
                    System.out.println("Insert Into:");
                    System.out.println("1. Customer");
                    System.out.println("2. Product");
                    System.out.println("3. Cart");
                    System.out.println("4. Order");
                    int insertChoice = sc.nextInt();

                    if (insertChoice == 1) {
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.next();

                        System.out.print("Mobile: ");
                        String mobile = sc.next();

                        System.out.print("Gender: ");
                        String gender = sc.next();

                        sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();

                        System.out.print("Password: ");
                        String password = sc.next();

                        String sql = "INSERT INTO ecommerce_db.customer_details "
                                   + "(customer_name, customer_emailid, customer_mobile_number, customer_gender, customer_address, password) "
                                   + "VALUES (?,?,?,?,?,?)";

                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, name);
                        ps.setString(2, email);
                        ps.setString(3, mobile);
                        ps.setString(4, gender);
                        ps.setString(5, address);
                        ps.setString(6, password);

                        ps.executeUpdate();
                        ps.close();
                        System.out.println("Customer Inserted");
                    }

                    else if (insertChoice == 2) {
                        sc.nextLine();
                        System.out.print("Product Name: ");
                        String pname = sc.nextLine();

                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        System.out.print("Discount: ");
                        double discount = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Brand: ");
                        String brand = sc.nextLine();

                        System.out.print("Category: ");
                        String category = sc.nextLine();

                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();

                        String sql = "INSERT INTO ecommerce_db.product_details "
                                   + "(product_name, product_price, product_discount, brand, category, quantity) "
                                   + "VALUES (?,?,?,?,?,?)";

                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, pname);
                        ps.setDouble(2, price);
                        ps.setDouble(3, discount);
                        ps.setString(4, brand);
                        ps.setString(5, category);
                        ps.setInt(6, qty);

                        ps.executeUpdate();
                        ps.close();
                        System.out.println("Product Inserted");
                    }

                    else if (insertChoice == 3) {
                        System.out.print("Customer ID: ");
                        int cid = sc.nextInt();

                        System.out.print("Product ID: ");
                        int pid = sc.nextInt();

                        String sql = "INSERT INTO ecommerce_db.cart_details (customer_id, product_id) VALUES (?,?)";
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, cid);
                        ps.setInt(2, pid);

                        ps.executeUpdate();
                        ps.close();
                        System.out.println("Cart Inserted");
                    }

                    else if (insertChoice == 4) {
                        System.out.print("Customer ID: ");
                        int cid = sc.nextInt();

                        System.out.print("Product ID: ");
                        int pid = sc.nextInt();

                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();

                        String sql = "INSERT INTO ecommerce_db.order_details "
                                   + "(customer_id, product_id, price, address) VALUES (?,?,?,?)";

                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setInt(1, cid);
                        ps.setInt(2, pid);
                        ps.setDouble(3, price);
                        ps.setString(4, address);

                        ps.executeUpdate();
                        ps.close();
                        System.out.println("Order Placed");
                    }
                    break;

                // ===================== UPDATE =====================
                case 2:
                    System.out.print("Enter Mobile No: ");
                    String mobile = sc.next();

                    System.out.print("Enter New Email: ");
                    String newEmail = sc.next();

                    String updateSql =
                        "UPDATE ecommerce_db.customer_details SET customer_emailid=? WHERE customer_mobile_number=?";

                    PreparedStatement psUpdate = con.prepareStatement(updateSql);
                    psUpdate.setString(1, newEmail);
                    psUpdate.setString(2, mobile);

                    int rows = psUpdate.executeUpdate();
                    System.out.println(rows > 0 ? "Email Updated" : "No Record Found");
                    psUpdate.close();
                    break;

                // ===================== DELETE =====================
                case 3:
                    System.out.print("Enter Cart ID: ");
                    int cartId = sc.nextInt();

                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();

                    String deleteSql =
                        "DELETE FROM ecommerce_db.cart_details WHERE cart_id=? AND product_id=?";

                    PreparedStatement psDelete = con.prepareStatement(deleteSql);
                    psDelete.setInt(1, cartId);
                    psDelete.setInt(2, productId);

                    int del = psDelete.executeUpdate();
                    System.out.println(del > 0 ? "Cart Deleted" : "No Cart Found");
                    psDelete.close();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
	}

}

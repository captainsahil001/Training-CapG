package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StepsOfJDBC {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 		 
		 System.out.println("Enter Employee Name");
		 String name = sc.next();
		 
		 System.out.println("Enter Employee Mobile_No");
		 long mobileno = sc.nextLong();
		 
		 System.out.println("Enter Employee Dept_No");
		 int deptno = sc.nextInt();
		 
		 System.out.println("Enter Employee Salary");
		 double salary = sc.nextDouble();
		 
		 String insert = "insert into iem.employee_details(emp_name, emp_mobile_number, emp_deptno, emp_salary) values(?,?,?,?)";
	
		 
		 

		 try {
			 
			 /* 1.Load the Driver Class */
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Loaded Successfully");
			
			/* 2.Establish the Connection */
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=sahil007");
			System.out.println("Connection successfully...");
			
			/* 3.Create Platform */
			
			//placeholder created with insert placeholder.
			PreparedStatement preparedStatement = con.prepareStatement(insert);
			System.out.println("Before setting values " + preparedStatement);
			
			//We need to set the values in placeholder using setters.
			preparedStatement.setString(1, name);
			preparedStatement.setLong(2, mobileno);
			preparedStatement.setInt(3, deptno);
			preparedStatement.setDouble(4, salary);
			System.out.println("After setting values " + preparedStatement);
			System.out.println("Platform Created");
			
			/* Execute Platform */
			
			int result = preparedStatement.executeUpdate();
			if(result!=0) {
				System.out.println("Data Inserted Successfull...");
			}else {
				System.out.println("Data Insertion Failed...");
			}
			
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		 } catch (SQLException e) {
			e.printStackTrace();
		 }
		 
		 sc.close();
		 
		 
		 
		 
	}
	
	
}

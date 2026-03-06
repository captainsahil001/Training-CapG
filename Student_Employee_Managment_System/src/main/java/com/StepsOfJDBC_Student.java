package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StepsOfJDBC_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Student Name");
		 String name = sc.next();
		 
		 System.out.println("Enter Student Percentage");
		 double percentage = sc.nextDouble();
		 
		 System.out.println("Enter Student Stream");
		 String stream = sc.next();
		 
		 System.out.println("Enter Student Degree");
		 String degree = sc.next();
		 
		 System.out.println("Enter Student Email");
		 String emailid = sc.next();
		 
		 System.out.println("Enter Student Gender");
		 String gender = sc.next();
		 
		 System.out.println("Enter Student D_O_B.");
		 String dobStr = sc.next();
		 Date dob = Date.valueOf(dobStr);
		 
		 System.out.println("Enter Student MobileNo.");
		 long mobileno = sc.nextLong();
		 
		 String insert = "insert into student_management_system.student_details(Student_Name, Student_Percentage, Student_Stream, Student_Degree, Student_Emailid, Student_Gender, Student_D_O_B, Student_Mobile_Number) values(?,?,?,?,?,?,?,?)";
	
		 
		 

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
			preparedStatement.setDouble(2, percentage);
			preparedStatement.setString(3, stream);
			preparedStatement.setString(4, degree);
			preparedStatement.setString(5, emailid);
			preparedStatement.setString(6, gender);
			preparedStatement.setDate(7, dob);
			preparedStatement.setLong(8, mobileno);
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

package com;
import java.sql.*;


public class Percentage80more {
	
		public static void main(String[] args) {
			String select = "SELECT * FROM student_details WHERE Student_Percentage>80;";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system?user=root&password=sahil007");
				PreparedStatement ps = conn.prepareStatement(select);
				ResultSet resultSet = ps.executeQuery();
				while(resultSet.next()) {
					System.out.print("\nStudent Name:- " +resultSet.getString("Student_Name"));
					System.out.print("\nStudent Percentgae:- " +resultSet.getString("Student_Percentage"));
					System.out.print("\nStudent Stream:- " +resultSet.getString("Student_Stream"));
					System.out.print("\nStudent Degree:- " +resultSet.getString("Student_Degree"));
					System.out.print("\nStudent Email ID:- " +resultSet.getString("Student_Emailid"));
					System.out.print("\nStudent Gender:- " +resultSet.getString("Student_Gender"));
					System.out.print("\nStudent DOB:- " +resultSet.getString("Student_D_O_B"));
					System.out.println("\nStudent Mobile Number:- " +resultSet.getString("Student_Mobile_Number"));
					System.out.print("\t****************************-------------------------**************************");
				}
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}



}

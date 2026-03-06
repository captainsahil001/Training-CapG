package com;

import java.sql.*;

public class Salary5000more {
	
		public static void main(String[] args) {
			String select = "SELECT * FROM employee_details WHERE emp_salary>50000;";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iem?user=root&password=sahil007");
				PreparedStatement ps = conn.prepareStatement(select);
				ResultSet resultSet = ps.executeQuery();
				while(resultSet.next()) {
					System.out.print("\nEmployee Name:- " +resultSet.getString("emp_name"));
					System.out.print("\nEmployee Mobile No.:- " +resultSet.getString("emp_mobile_number"));
					System.out.print("\nEmployee Dept No.:- " +resultSet.getString("emp_deptno"));
					System.out.println("\nEmployee Salary:- " +resultSet.getString("emp_salary"));
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

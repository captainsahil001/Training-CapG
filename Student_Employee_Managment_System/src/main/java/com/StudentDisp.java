package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentDisp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name / Email / Gender / Stream / Degree:");
        String input = sc.nextLine();

        String select =
            "SELECT * FROM student_details " +
            "WHERE Student_Name LIKE ? " +
            "OR Student_Emailid LIKE ? " +
            "OR Student_Gender LIKE ? " +
            "OR Student_Stream LIKE ? " +
            "OR Student_Degree LIKE ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_management_system?user=root&password=sahil007"
            );

            PreparedStatement ps = conn.prepareStatement(select);

            String value = "%" + input + "%";

            // same input set for all 5 columns
            ps.setString(1, value);
            ps.setString(2, value);
            ps.setString(3, value);
            ps.setString(4, value);
            ps.setString(5, value);

            ResultSet resultSet = ps.executeQuery();

            boolean found = false;

            while (resultSet.next()) {
                found = true;

                System.out.println("\nStudent Name:- " + resultSet.getString("Student_Name"));
                System.out.println("Student Percentage:- " + resultSet.getString("Student_Percentage"));
                System.out.println("Student Stream:- " + resultSet.getString("Student_Stream"));
                System.out.println("Student Degree:- " + resultSet.getString("Student_Degree"));
                System.out.println("Student Email ID:- " + resultSet.getString("Student_Emailid"));
                System.out.println("Student Gender:- " + resultSet.getString("Student_Gender"));
                System.out.println("Student DOB:- " + resultSet.getString("Student_D_O_B"));
                System.out.println("Student Mobile Number:- " + resultSet.getString("Student_Mobile_Number"));
                System.out.println("--------------------------------------------------");
            }

            if (!found) {
                System.out.println("No data found.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
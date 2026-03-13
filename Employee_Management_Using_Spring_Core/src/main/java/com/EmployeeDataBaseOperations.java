package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDataBaseOperations {

    @Autowired
    DataBaseConnections db;
    
    @Autowired
    Scanner sc;

    public void insertEmployeeDetails() {

        try {

            Connection con = db.mysqlDbConnections();
            System.out.println("Connection Established");

            Statement stmt = con.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS employee ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "salary DOUBLE, "
                    + "deptno INT"
                    + ")";

            stmt.executeUpdate(query);

            System.out.println("Employee Table Created Successfully");
            
            System.out.println("Enter Employee Name");
            String name = sc.next();
            System.out.println("Enter Employee Salary");
            double salary = sc.nextDouble();
            System.out.println("Enter dept no");
            int deptno = sc.nextInt();

            String query1 = "INSERT INTO employee(name, salary, deptno) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query1);

            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setInt(3, deptno);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Inserted Successfully");
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
package com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class MainEmployee {
	public static void main(String[] args) throws IOException {
		List<EmployeeDetails> list  = new ArrayList<>();
		list.add(new EmployeeDetails(1,"Sahil",50000d,1,"sg@gmail.com","Male"));
		list.add(new EmployeeDetails(2,"Animesha",40000d,2,"sg@gmail.com","Female"));
		list.add(new EmployeeDetails(3,"Sombit",30000d,2,"sg@gmail.com","Male"));
		list.add(new EmployeeDetails(4,"Arnab",50000d,3,"sg@gmail.com","Male"));
		list.add(new EmployeeDetails(5,"Subhomoyi",8000d,1,"sg@gmail.com","Female"));
		
		
		/* Stream Api */
		
		long countofmale = list.stream().filter(emp->emp.getGender().equalsIgnoreCase("MALE")).count();
		System.out.println(countofmale);
		
		System.out.println("--------------------------------------------");
		
		// Another part
		List<EmployeeDetails> lessTen =
		        	list.stream()
		            .filter(emp -> emp.getSalary() < 10000)
		            .collect(Collectors.toList());

		lessTen.forEach(System.out::println);
		
		
		System.out.println("--------------------------------------------");

		
		// Another part
		List<EmployeeDetails> updatedEmployees = list.stream()
		        .peek(e -> e.setSalary(e.getSalary() * 1.05))
		        .collect(Collectors.toList());
		
		updatedEmployees.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		
		// Another part
		Set<Integer> uniqDept = new HashSet<>();

		List<EmployeeDetails> uniqueDeptEmployees =
		        list.stream()
		            .filter(emp -> uniqDept.add(emp.getDeptno()))
		            .collect(Collectors.toList());

		uniqueDeptEmployees.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		
		// Another part
		// Return distinct or unique 1 value ->
		EmployeeDetails minSal = list.stream()
				.min((emp1,emp2)-> Double.compare(emp1.getSalary(),emp2.getSalary())).get();
		System.out.println(minSal);
		
		System.out.println("--------------------------------------------");
		
		// Returns list of values if they got same and are minimum too ->
		double minSale =
		        list.stream()
		            .mapToDouble(EmployeeDetails::getSalary)
		            .min()
		            .orElseThrow();
		
		List<EmployeeDetails> minSalEmp =
		        list.stream()
		            .filter(emp -> emp.getSalary() == minSale)
		            .collect(Collectors.toList());

		minSalEmp.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");

		        
		
		
		

		        

		
		/* File Handling */
		/* ------------ */
		
		
		/* 1) Creating a new file */
		
		
//		File file = new File("Employee.txt");
//		if(file.createNewFile()) {
//			System.out.println("A new file is created");
//		}else {
//			System.out.println("No file was created");
//		}
		
		
		/* 2) Writing on an existing file */
		
//		FileWriter filewriter = new FileWriter("Employee.txt");  // writer is the method which is used to write the data on the file.
//		filewriter.write("Male Employee count: "+ countofmale); 
//		filewriter.close();                             // close method is used to commit the data and close the connection b/w the java file and the text file.
		
		
		
//		EmployeeDetails employeedetails = list.stream().max((emp1,emp2)-> Double.compare(emp1.getSalary(),emp2.getSalary())).get();
//		System.out.println(employeedetails);
//		
//		FileWriter writer = new FileWriter("MaxEmployeeSalary.txt");
//		writer.write("Employee ID: " + employeedetails.getId()+ "\n" + "Employee Name: " + employeedetails.getName()+"\n" + "Employee Salary: " + employeedetails.getSalary());
//		writer.close();
		
		}
	

}

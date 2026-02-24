package mock;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.io.*;

enum DepartmentType{
	It, Hr, Finance, Admin
}

class Department{
	private DepartmentType departmentType;

	public Department(DepartmentType departmentType) {
		this.departmentType = departmentType;
	}
	
	public DepartmentType getDepartmentType() {
		return departmentType;
	}
	
}


class Employee implements Serializable {
	private int id;
	private String name;
	private Department department;
	private double salary;
	
	public Employee(int id, String name, Department department, double salary) throws InvalidSalaryException {
		if(salary<=0) {
			throw new InvalidSalaryException("Invalid Salary" + salary);
		}
	
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + department.getDepartmentType() + " " + salary ;
	}
}
@SuppressWarnings("serial")
class InvalidSalaryException extends Exception{

	public InvalidSalaryException(String mssg) {
		super(mssg);
	}
	
}

class EmployeeService{
	
	//Read Employee
	public static List<Employee> readEmployees(String fileName) throws InvalidSalaryException{
		List<Employee> employee = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while((line = br.readLine()) != null) {
				try {
					String[] data = line.split(",");
					int id = Integer.parseInt(data[0]);
					String name = data[1];
					DepartmentType deptType = DepartmentType.valueOf(data[2]);
					double salary = Double.parseDouble(data[3]);
					
					employee.add(new Employee(id, name, new Department(deptType), salary));
				
			}catch(NumberFormatException e) {
				System.out.println("Invalid  Salary" + line);
				
			}
			
			}
			
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		return employee;
		
	}
	
	//Employee with sal>40000
	public static List<Employee> highSal(List<Employee> list){
		return list.stream()
				.filter(e -> e.getSalary()>40000)
				.collect(Collectors.toList());
	}
	
	//Group By Dept
	public static Map<DepartmentType, List<Employee>> groupBy(List<Employee> list){
		return list.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentType()));
	}
	
	//Avg sal of it
	public static double avgSal(List<Employee> list) {
		return list.stream()
				.filter(e -> e.getDepartment().getDepartmentType() == DepartmentType.It)
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0);
	}
	
	//Sort by sal
	public static List<Employee> getSalary(List<Employee>list) {
		return list.stream()
				.sorted((a,b) -> Double.compare(b.getSalary(), a.getSalary()))
				.collect(Collectors.toList());
	}
	
	//Sort sal by dept
	public static double getDeptSal(List<Employee> list, DepartmentType dept) {
		return list.stream()
				.filter(e -> e.getDepartment().getDepartmentType() == dept)
				.mapToDouble(Employee::getSalary)
				.sum();
	}
	
	//sort max sal by dept
	public static double getDeptSalMax(List<Employee> list, DepartmentType dept) {
		return list.stream()
				.filter(e -> e.getDepartment().getDepartmentType() == dept)
				.mapToDouble(Employee::getSalary)
				.max()
				.orElse(0);
	
	}
}


public class Main {

    public static void main(String[] args) {

        // ── Step 1: Create sample employees.csv for testing ──────────────────
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"))) {
            bw.write("1,Sahil,It,50000.0");      bw.newLine();
            bw.write("2,Animesha,Hr,40000.0");   bw.newLine();
            bw.write("3,Arnab,Finance,30000.0"); bw.newLine();
            bw.write("4,Nikhil,It,60000.0");     bw.newLine();
            bw.write("5,Tushar,Admin,20000.0");  bw.newLine();
            bw.write("6,Sakshami,Hr,55000.0");   bw.newLine();
            bw.write("7,Aditya,Finance,45000.0");bw.newLine();
            bw.write("8,Bala,It,70000.0");       bw.newLine();
            bw.write("9,Dharani,Admin,15000.0"); bw.newLine();
            bw.write("10,Arun,It,80000.0");      bw.newLine();
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        // ── Step 2: Read employees from CSV ──────────────────────────────────
        List<Employee> employees = new ArrayList<>();
        try {
            employees = EmployeeService.readEmployees("employees.csv");
        } catch (InvalidSalaryException e) {
            System.out.println("Salary error while reading: " + e.getMessage());
        }

        System.out.println("══════════════════════════════════════");
        System.out.println("         ALL EMPLOYEES                ");
        System.out.println("══════════════════════════════════════");
        employees.forEach(System.out::println);

        // ── Step 3: High Salary Employees (> 40000) ───────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("     EMPLOYEES WITH SALARY > 40000    ");
        System.out.println("══════════════════════════════════════");
        List<Employee> highSalList = EmployeeService.highSal(employees);
        highSalList.forEach(System.out::println);

        // ── Step 4: Group By Department ───────────────────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("        GROUPED BY DEPARTMENT         ");
        System.out.println("══════════════════════════════════════");
        Map<DepartmentType, List<Employee>> grouped = EmployeeService.groupBy(employees);
        grouped.forEach((dept, empList) -> {
            System.out.println("\n[ " + dept + " ]");
            empList.forEach(System.out::println);
        });

        // ── Step 5: Average Salary of IT Department ───────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("      AVG SALARY OF IT DEPARTMENT     ");
        System.out.println("══════════════════════════════════════");
        double avgIt = EmployeeService.avgSal(employees);
        System.out.println("Average IT Salary: " + avgIt);

        // ── Step 6: Sort All Employees by Salary (Descending) ─────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("   ALL EMPLOYEES SORTED BY SALARY     ");
        System.out.println("══════════════════════════════════════");
        List<Employee> sortedBySal = EmployeeService.getSalary(employees);
        sortedBySal.forEach(System.out::println);

        // ── Step 7: Total Salary per Department ───────────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("       TOTAL SALARY BY DEPARTMENT     ");
        System.out.println("══════════════════════════════════════");
        for (DepartmentType dept : DepartmentType.values()) {
            double total = EmployeeService.getDeptSal(employees, dept);
            System.out.println(dept + " Total Salary : " + total);
        }

        // ── Step 8: Max Salary per Department ─────────────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("        MAX SALARY BY DEPARTMENT      ");
        System.out.println("══════════════════════════════════════");
        for (DepartmentType dept : DepartmentType.values()) {
            double max = EmployeeService.getDeptSalMax(employees, dept);
            System.out.println(dept + " Max Salary   : " + max);
        }

        // ── Step 9: Test InvalidSalaryException ───────────────────────────────
        System.out.println("\n══════════════════════════════════════");
        System.out.println("     TESTING InvalidSalaryException   ");
        System.out.println("══════════════════════════════════════");
        try {
            Employee badEmp = new Employee(99, "Ghost", new Department(DepartmentType.It), -5000);
        } catch (InvalidSalaryException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


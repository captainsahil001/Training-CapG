package com;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	
	public static void display(EmployeeDetails[] employee) {
		for(EmployeeDetails e:employee) {
			System.out.println(e);
		}
	}
	
	public static void displaysal(EmployeeDetails[] employee) {
		for(EmployeeDetails e:employee) {
			if(e.getSalary()>15000) {
				System.out.println(e);
			}
		}
	}
	
	public static void count(EmployeeDetails[] employee) {
		int m=0, f=0;
		for(EmployeeDetails e:employee) {
			if(e.getGender().equalsIgnoreCase("Male")) {
				m++;
			}else {
				f++;
			}
		}
		System.out.println("Male:" + m + "Female:" + f);
	}
	
	public static void sortSal(EmployeeDetails[] employee) {
		Arrays.sort(employee, (a,b)-> Double.compare(a.getSalary(),b.getSalary()));
	}
	
	public static void displayDeptNo(EmployeeDetails[] employee) {
		for(EmployeeDetails e:employee) {
			if(e.getDeptno() == 10) {
				System.out.println(e);
				e.setSalary(e.getSalary()*1.10);
			}
		}
	}
	
	public static void maxSal(EmployeeDetails[] employee) {
		EmployeeDetails temp = employee[0];
		
		for(EmployeeDetails e:employee) {
			if(e.getSalary()>temp.getSalary()) {
				temp = e;
			}
		}
		System.out.println(temp);
	}
	
	public static void minSal(EmployeeDetails[] employee) {
		EmployeeDetails temp = employee[0];
		
		for(EmployeeDetails e:employee) {
			if(e.getSalary()<temp.getSalary()) {
				temp = e;
			}
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
	
		
		EmployeeDetails[] employee = new EmployeeDetails[] {
				new EmployeeDetails(1,"Sahil",50000d,1,"sg@gmail.com","Male"),
				new EmployeeDetails(2,"Animesha",40000d,1,"sg@gmail.com","Female"),
				new EmployeeDetails(3,"Sombit",30000d,1,"sg@gmail.com","Male"),
				new EmployeeDetails(4,"Arnab",50000d,1,"sg@gmail.com","Male"),
				new EmployeeDetails(5,"Subhomoyi",70000d,1,"sg@gmail.com","female"),
				new EmployeeDetails(6,"Sayantana",10000d,1,"sg@gmail.com","female"),
				new EmployeeDetails(7,"Aditya",12000d,1,"sg@gmail.com","female"),
				new EmployeeDetails(8,"Nikhil",35000d,1,"sg@gmail.com","Male"),
				new EmployeeDetails(9,"Tushar",200d,1,"sg@gmail.com","Male"),
				new EmployeeDetails(10,"Sakshami",45000d,1,"sg@gmail.com","Female"),
				
		};
		
		Scanner sc = new Scanner(System.in);
	    int choice;

	    do {
	        System.out.println("\n===== EMPLOYEE MENU =====");
	        System.out.println("1. Display All Employees");
	        System.out.println("2. Display Salary > 15000");
	        System.out.println("3. Count Male & Female");
	        System.out.println("4. Sort By Salary");
	        System.out.println("5. Display Dept 10 & Increment Salary");
	        System.out.println("6. Max Salary Employee");
	        System.out.println("7. Min Salary Employee");
	        System.out.println("0. Exit");
	        System.out.print("Enter choice: ");

	        choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                display(employee);
	                break;

	            case 2:
	                displaysal(employee);
	                break;

	            case 3:
	                count(employee);
	                break;

	            case 4:
	                sortSal(employee);
	                System.out.println("Sorted by salary:");
	                display(employee);
	                break;

	            case 5:
	                displayDeptNo(employee);
	                break;

	            case 6:
	                maxSal(employee);
	                break;

	            case 7:
	                minSal(employee);
	                break;

	            case 0:
	                System.out.println("Exiting program...");
	                break;

	            default:
	                System.out.println("Invalid choice!");
	        }

	    } while (choice != 0);

	    sc.close();
		
	}

}


/* in 4 FI form*/


//package com;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.function.*;
//
//public class Employee3 {
//	public static void main(String[] args) {
//		Supplier<EmployeeDetails[]> supplier = () -> {
//			return new EmployeeDetails[] {
//					new EmployeeDetails(101, "Animesh", 55000.0, 10, "animesh@company.com", "Male"),
//					new EmployeeDetails(102, "Rohit", 48000.0, 20, "rohit@company.com", "Male"),
//					new EmployeeDetails(103, "Sneha", 62000.0, 10, "sneha@company.com", "Female"),
//					new EmployeeDetails(104, "Priya", 51000.0, 30, "priya@company.com", "Female"),
//					new EmployeeDetails(105, "Amit", 70000.0, 20, "amit@company.com", "Male"),
//					new EmployeeDetails(106, "Neha", 45000.0, 30, "neha@company.com", "Female"),
//					new EmployeeDetails(107, "Rahul", 80000.0, 10, "rahul@company.com", "Male"),
//					new EmployeeDetails(108, "Kiran", 60000.0, 40, "kiran@company.com", "Aditya"), };
//		};
//		
//		EmployeeDetails[] employees = supplier.get();
//
//		Predicate<EmployeeDetails> greater15000 = (e) -> e.getSalary() > 55000;
//		Predicate<EmployeeDetails> isMale = (e) -> e.getGender().equalsIgnoreCase("male");
//		Predicate<EmployeeDetails> deptNo = (e) -> e.getDeptno() == 10;
//		
//		Function<EmployeeDetails,EmployeeDetails> salaryHike = (a) -> {
//			a.setSalary(a.getSalary()*1.1);
//			return a;
//		};
//		
//		Consumer<EmployeeDetails> consumer = (a) -> System.out.println(a);;
//		
//		Scanner sc = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("\n----- EMPLOYEE MENU -----");
//            System.out.println("1. Display All Employees");
//            System.out.println("2. Salary > 15000");
//            System.out.println("3. Count Gender");
//            System.out.println("4. Sort by Salary");
//            System.out.println("5. Dept No 10 + 10% Hike");
//            System.out.println("6. Employee with Max Salary");
//            System.out.println("7. Employee with Min Salary");
//            System.out.println("0. Exit");
//            System.out.print("Enter choice: ");
//
//            choice = sc.nextInt();
//            System.out.println();
//
//            switch (choice) {
//                case 1:
////                    for(EmployeeDetails e: employees) {
////                    		consumer.accept(e);
////                    }
//                    Arrays.stream(employees).forEach(consumer);
//                    break;
//
//                case 2:
////                    for(EmployeeDetails e: employees) {
////                    		if(greater15000.test(e)) {
////                    			consumer.accept(e);
////                    		}
////                    }
//                    Arrays.stream(employees).filter(greater15000).forEach(consumer);
//                    break;
//
//                case 3:
//                		long m=0,f=0;
////	                	for(EmployeeDetails e: employees) {
////	                		if(isMale.test(e)) {
////	                			m++;
////	                		}
////	                		else {
////	                			f++;
////	                		}
////	                }
//	                	m = Arrays.stream(employees).filter(isMale).count();
//	                	f = employees.length - m;
//	                	System.out.printf("Male : %d || Female %d\n\n",m,f);         
//                    break;
//
//                case 4:
////                    Arrays.sort(employees,(a,b)->Double.compare(a.getSalary(), b.getSalary()));
////                    for(EmployeeDetails e: employees) {
////	                		consumer.accept(e);
////	                }
//                	
//                    Arrays.sort(employees,(a,b)->Double.compare(a.getSalary(), b.getSalary()));
//                    Arrays.stream(employees).forEach(consumer);
//                    break;
//
//                case 5:
////	                	for(EmployeeDetails e : employees) {
////	            			if(deptNo.test(e)) {
////	            				consumer.accept(e);	         
////	            				e.setSalary(salary.apply(e));
////	            			}
////	            		}
//	                	Arrays.stream(employees).filter(deptNo).map(salaryHike).forEach(consumer);
//                    break;
//
//                case 6:
//                	Arrays.stream(employees)
//                    .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
//                    .ifPresent(consumer);
//                    break;
//
//                case 7:
//                	Arrays.stream(employees)
//                    .min((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
//                    .ifPresent(consumer);
//                    break;
//
//                case 0:
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//
//        } while (choice != 0);
//        
//        sc.close();
//
//	}
//}

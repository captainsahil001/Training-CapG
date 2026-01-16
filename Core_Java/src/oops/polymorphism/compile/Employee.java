package oops.polymorphism.compile;

public class Employee {
	int id;
	String name;
	long salary;
	String dept;
	public Employee(int id) {
		this.id =id;
	}
	public Employee(int id,String name) {
		this(id);
		this.name = name;
	}
	public Employee(int id,String name,long salary) {
		this(id,name);
		this.salary=salary;
		
	}
	public Employee(int id,String name,long salary,String dept) {
		this(id,name,salary);
		this.dept=dept;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(100);
		System.out.println(e.id);
		
		Employee e1 = new Employee(101,"Sahil");
		System.out.println(e1.id +" " + e1.name);
		
		Employee e2 = new Employee(102,"SahGH",50000);
		System.out.println(e2.id + " " + e2.name + " " + e2.salary);
		
		Employee e3 = new Employee(103,"sahgh",60000,"IT");
		System.out.println(e3.id + " " +e3.name + " "+ e3.salary +" "+ e3.dept);
	}
	
	
	

}

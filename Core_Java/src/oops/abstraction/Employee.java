package oops.abstraction;

public abstract class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee() {
		
	}
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r = new Raju(10, "Raju",10000.02);
		r.printEmployee();
		Employee e =new Raju(100, "Sanju", 1000.05);
		e.printEmployee();
	}
}

class Raju extends Employee{
	double sal;
	public Raju(int id, String name,double sal) {
		super(id,name);
		this.sal=sal;
	}
	@Override
	public void printEmployee() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sal);
	}
	
	
}

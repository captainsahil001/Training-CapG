package oops.supcall;

public class Employee extends Human{
	int id;
	double salary;
	public Employee(String name,int age,String gender,int id,double salary) {
		super(name,age,gender);
		this.id=id;
		this.salary = salary;
	}

}

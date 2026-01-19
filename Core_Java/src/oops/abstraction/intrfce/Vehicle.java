package oops.abstraction.intrfce;

public interface Vehicle {
	void price();
	void type();
}
class Bike implements Vehicle{
	
	public void price() {
		System.out.println(200000);
	}

	public void type() {
		System.out.println("Petrol");
	}

	
}
class Car implements Vehicle{
	public void price() {
		System.out.println("261429");
	}
	public void type() {
		System.out.println("EV");
	}
}

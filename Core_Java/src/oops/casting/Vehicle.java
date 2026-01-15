package oops.casting;

public class Vehicle {
	public void travel() {
		System.out.println("We can travel with any vehicle");
	}
	public static void main(String[] args) {
		Vehicle v1 = new Bike();
		v1.travel();
		Bike b1 = (Bike) v1;
		b1.topspeed();
		v1 = new Car();
		v1.travel();
		Car c1 = (Car) v1;
		c1.noOfPass();
		v1 = new Train();
		v1.travel();
		Train t1 = (Train) v1;
		t1.ticketPrice();
		
//		Class caste exception:->
		
//		Vehicle v2 = new Vehicle();
//		Bike b2 = (Bike) v2;
	}

}

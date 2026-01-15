package oops.supcall;

public class Mobile extends Product {
	double price;
	boolean sim;
	public Mobile(String brand,double price,boolean sim) {
		super(brand);
		this.price = price;
		this.sim = sim;
	}
	

}

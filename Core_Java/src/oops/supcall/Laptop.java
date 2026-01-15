package oops.supcall;

public class Laptop extends Product{
	double price;
	String processor;
	public Laptop(String brand, double price, String processor) {
		super(brand);
		this.price = price;
		this.processor = processor;
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("Dell",20000,"Intel");
		System.out.println(l.brand);
		System.out.println(l.price);
		System.out.println(l.processor);
	}

}

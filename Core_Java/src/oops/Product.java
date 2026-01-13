package oops;

public class Product {
	int id;
	String name;
	long price;
	double rating;
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Product(int id, String name,long price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(int id, String name,long price,double rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(rating);
	}
	public static void main(String[] args) {
		Product p = new Product(1,"pen",10,4.0);
		p.display();
	}

}

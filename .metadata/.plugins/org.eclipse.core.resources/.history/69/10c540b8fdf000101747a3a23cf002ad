package oops;

public class Laptop {

	    String brand;
	    double price;

	    void display() {
	        System.out.println("Brand: " + brand + ", Price: " + price);
	    }

	    static void compare(Laptop l1, Laptop l2) {

	        if (l1.price > l2.price) {
	            System.out.println(l1.brand + " is more expensive");
	        } else if (l1.price < l2.price) {
	            System.out.println(l2.brand + " is more expensive");
	        } else {
	            System.out.println("Both laptops have the same price");
	        }
	    }

	    public static void main(String[] args) {

	        Laptop lap1 = new Laptop();
	        lap1.brand = "Dell";
	        lap1.price = 55000;

	        Laptop lap2 = new Laptop();
	        lap2.brand = "HP";
	        lap2.price = 60000;

	        lap1.display();
	        lap2.display();

	        compare(lap1, lap2);
	    }
	

}

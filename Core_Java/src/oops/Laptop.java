package oops;

public class Laptop {

	    String brand;
	    double price;
	     
	    public Laptop(String brand, double price) {
			this.brand = brand;
			this.price = price;
		}

		void display() {
	        System.out.println("Brand: " + brand + ", Price: " + price);
	    }
		
		public void compareLaptop(Laptop l1) {
			if(this.price>l1.price) {
				System.out.println(this.brand + " is more costly");
			}
			else {
				System.out.println(l1.brand + " is more costly");
			}
		}


	    public static void main(String[] args) {

	        Laptop lap1 = new Laptop("DELL",55000);
	       

	        Laptop lap2 = new Laptop("ASUS",60000);
	        

	        lap2.compareLaptop(lap1);

	        
	    }
	

}

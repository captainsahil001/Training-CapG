package oops;

public class Laptop {

	    String brand;
	    double price;
	    
	     
	    public Laptop() {
	    	super();
		}

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


	    @SuppressWarnings("unused")
		public static void main(String[] args) {

//	        Laptop lap1 = new Laptop("DELL",55000);
//	       
//
//	        Laptop lap2 = new Laptop("ASUS",60000);
//	        
	    	Laptop lap1 = HelpLaptop.getLaptop();
	    	lap1.brand = "Dell";
	    	lap1.price = 55000;
	    	Laptop lap2 = HelpLaptop.getLaptop();
	    	lap2.brand = "Asus";
	    	lap2.price = 60000;
	        lap2.compareLaptop(lap1);
	        Laptop lap3 = HelpLaptop.getLaptopdata("HP", 75000);
	        lap3.compareLaptop(lap2);
	        Laptop lap4 = HelpLaptop.getLaptopPr("Dell", 1000);
	        
	    }
	

}

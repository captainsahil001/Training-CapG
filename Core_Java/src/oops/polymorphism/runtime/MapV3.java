package oops.polymorphism.runtime;

public class MapV3 extends MapV2{
	public void bookCab() {
		System.out.println("Cab Booked");
	}
	public static void main(String[] args) {
		MapV3 m1= new MapV3();
		m1.route();
		m1.bookCab();
		System.out.println();
		
		MapV1 m2 = new MapV3();
		m2.route();
		System.out.println();
		
		MapV2 m5 =(MapV2)m2;
		m5.route();
		System.out.println();
		
		MapV3 m3=(MapV3) m2;
		m3.bookCab();
		m3.route();
	}

}

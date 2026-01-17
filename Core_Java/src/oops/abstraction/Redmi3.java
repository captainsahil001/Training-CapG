package oops.abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartCamera() {
		System.out.println("Redmi3 have smart camera");
	}
	public static void main(String[] args) {
		Redmi3 r3= new Redmi3();
		r3.camera();
		r3.battery();
		r3.smartCamera();
		
		Mobile m = new Redmi3();
		m.camera();
		m.battery();
//		m.smartCamera();    CTE
		
		Redmi1 r1 = new Redmi3();
		r1.camera();
		r1.battery();
//		r1.smartCamera();    CTE
		
		Redmi2 r2 = new Redmi3();
		r2.camera();
		r2.battery();
		r2.smartCamera();
	}
	
	
}

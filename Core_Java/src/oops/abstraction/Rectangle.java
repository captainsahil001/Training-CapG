package oops.abstraction;

public class Rectangle extends Shape{
	@Override
	public void area() {
		System.out.println("area of Rectangle");
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		r.display();
		
		Circle c = new Circle();
		c.area();
		c.display();
		
		
		
	}

}

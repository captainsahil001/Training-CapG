package oops.polymorphism.runtime;

public class Child extends Parent{
	@Override
	public void home() {
		System.out.println("RED");
	}
	public void bike() {
		System.out.println("BMW");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.home();
		Child c =new Child();
		c.home();
		c.bike();
		Parent p2 = new Child();
		p2.home();
		}
}

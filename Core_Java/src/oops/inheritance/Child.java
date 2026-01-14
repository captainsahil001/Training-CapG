package oops.inheritance;

public class Child extends Parent {
	int b=20;
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		
		Parent p = new Parent();
		System.out.println(p.a);
		p.m1();
	}
	
	
}

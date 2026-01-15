package oops;

public class Example {
	int a1;
	static int a2;
	Student s1;
	static Student s2;
	public Example() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(this.s1);
		
	}
	public void m1() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(this.s1);
	}
	public static void m2() {
		Example e = new Example();
		System.out.println(e.a1);
		System.out.println(a2);
		System.out.println(e.s1);
		System.out.println(s2);
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Example e = new Example();
		e.m1();
		m2();
		Employee e2 = null;
		Employee e3;
		
	}
	

}

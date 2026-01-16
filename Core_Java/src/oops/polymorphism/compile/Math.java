package oops.polymorphism.compile;

public class Math {
	public static void add(int a,int b) {
		System.out.println("2 int type");
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println("3 int type");
		System.out.println(a+b+c);
	}
	public static void add(float a,float b) {
		System.out.println("2 float type");
		System.out.println(a+b);
	}
	public static void add(double a,double b) {
		System.out.println("2 double type");
		System.out.println(a+b);
	}
	public  int add(int a, int b, int c, int d) {
		System.out.println("4 int type with return");
		return(a+b+c+d);
	}
	public static void main(String[] args) {
		add(2,3);
		add(2f,3f);
		add(2,3,4);
		add(3d,4d);
		Math m = new Math();
		
		System.out.println(m.add(3,4,5,6));
		
		
		
	}

}

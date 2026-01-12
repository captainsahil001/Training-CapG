package method;

public class Calculation {
	
	public static void add(int a , int b) {
		System.out.println(a + b);
	}	
	
	public static void subtract(int a , int b) {
		System.out.println(a - b);
	}
	
	public static void multiply(long a , long b) {
		System.out.println(a * b);
	}
	
	public static void divide(double a , double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		add(3,5);
		subtract(6,3);
		multiply(5,5);
		divide(4,2);
		
	}

}

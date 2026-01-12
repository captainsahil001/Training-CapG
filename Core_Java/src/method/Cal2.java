package method;

public class Cal2 {
	public static int add(int a , int b) {
		return (a + b);
	}	
	
	public static int subtract(int a , int b) {
		return(a - b);
	}
	
	public static long multiply(long a , long b) {
		return(a * b);
	}
	
	public static double divide(double a , double b) {
		return(a/b);
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 4;
		double res = 0;
		char ch = '+';
		switch(ch) {
		case('+'):{
			res = add(a,b);
			System.out.println(res);
		}
			break;
		case('-'):{
			res = subtract(a,b);
			System.out.println(res);

		}
			break;
		case('*'):{
			res = multiply(a,b);
			System.out.println(res);

		}
			break;
		case('/'):{
			res = divide(a,b);
			System.out.println(res);

		}
			break;
		default:{
			System.out.println("Invalid Sign Input");
		}
		}
		
	}

}

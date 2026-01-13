package staticVarArgs;

public class Program {
	public static void palindrome(int a) {
		int number = a; 
		int original = number;
		int reverse = 0;

		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}

		if (original == reverse) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
	}
	public static void isPrime(int b) {
		if( b == 1) {
			System.out.println("Not Prime");
		}
		int count = 0;
		for(int i=2;i*i<=b;) {
			if(b%i==0) {
				count++;
			}
			if(count>0) {
				System.out.println("Not Prime");
			}
			break;
		}
		if(count == 0) {
			System.out.println("Prime");
		}
	}

}

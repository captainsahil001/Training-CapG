package loop;

public class PalindromeNumber {
	public static void main(String[] args) {

		int number = 121; 
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
}

package method;

public class PalindromeCheck {
	

	    public static String checkPalindrome(int number) {

	        int original = number;
	        int reverse = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number = number / 10;
	        }

	        if (original == reverse) {
	            return "Good";
	        } else {
	            return "Bad";
	        }
	    }

	    public static void main(String[] args) {
	        int number = 121;

	        System.out.println(checkPalindrome(number));
	    }
	


}

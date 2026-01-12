package maths;

public class DisariumNumber {
	

	    public static boolean isDisarium(int number) {

	        int original = number;
	        int sum = 0;

	        // count number of digits
	        int temp = number;
	        int digits = 0;
	        while (temp != 0) {
	            digits++;
	            temp = temp / 10;
	        }

	        // calculate disarium sum
	        temp = number;
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum = sum + (int) Math.pow(digit, digits);
	            digits--;
	            temp = temp / 10;
	        }

	        return sum == original;
	    }

	    public static void main(String[] args) {

	        int number = 135;

	        if (isDisarium(number)) {
	            System.out.println(number + " is a Disarium Number");
	        } else {
	            System.out.println(number + " is NOT a Disarium Number");
	        }
	    }
	


}

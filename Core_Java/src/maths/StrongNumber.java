package maths;

public class StrongNumber {
	

	    static boolean isStrong(int number) {

	        int original = number;
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            int fact = 1;

	            for (int i = 1; i <= digit; i++) {
	                fact = fact * i;
	            }

	            sum = sum + fact;
	            number = number / 10;
	        }

	        return sum == original;
	    }

	    public static void main(String[] args) {

	        int number = 145;

	        if (isStrong(number)) {
	            System.out.println(number + " is a Strong Number");
	        } else {
	            System.out.println(number + " is NOT a Strong Number");
	        }
	    }
	


}

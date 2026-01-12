package maths;

public class CountBits {
	
	    public static void main(String[] args) {

	        int number = 29;   
	        int count = 0;

	        while (number != 0) {
	            if (number % 2 == 1) {
	                count++;
	            }
	            number = number / 2;
	        }

	        System.out.println("Number of bits = " + count);
	    }
	


}

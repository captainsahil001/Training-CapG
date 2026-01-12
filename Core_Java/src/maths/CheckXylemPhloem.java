package maths;

public class CheckXylemPhloem {
	

	   public static String checkXylemPhloem(int number) {

	        int lastDigit = number % 10;
	        int firstDigit;
	        int middleSum = 0;

	        number = number / 10; // remove last digit

	        while (number >= 10) {
	            middleSum = middleSum + (number % 10);
	            number = number / 10;
	        }

	        firstDigit = number;

	        if (firstDigit + lastDigit == middleSum) {
	            return "Xylem Number";
	        } else {
	            return "Phloem Number";
	        }
	    }

	    public static void main(String[] args) {

	        int number = 1210;

	        System.out.println(checkXylemPhloem(number));
	    }
	


}

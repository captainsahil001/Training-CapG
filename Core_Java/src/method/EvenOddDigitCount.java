package method;

public class EvenOddDigitCount {
	

	    public static boolean isEvenOddCountSame(int number) {

	        int evenCount = 0;
	        int oddCount = 0;

	        while (number != 0) {
	            int digit = number % 10;

	            if (digit % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }

	            number = number / 10;
	        }

	        return evenCount == oddCount;
	    }

	    public static void main(String[] args) {
	        int number = 1234;

	        System.out.println(isEvenOddCountSame(number));
	    }
	


}

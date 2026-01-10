package loop;

public class CountEvOdDigits {

	public static void main(String[] args) {

		int number = 1234567; 
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

		System.out.println("Even digits count = " + evenCount);
		System.out.println("Odd digits count  = " + oddCount);
	}

}

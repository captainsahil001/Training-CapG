package loop;

public class CountZero {
	public static void main(String[] args) {

		int number = 1020304050; 
		int zeroCount = 0;

		while (number != 0) {
			int digit = number % 10;

			if (digit == 0) {
				zeroCount++;
			}

			number = number / 10;
		}

		System.out.println("Number of zeroes = " + zeroCount);
	}

}

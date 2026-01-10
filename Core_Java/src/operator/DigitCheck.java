package operator;

public class DigitCheck {
	public static void main(String[] args) {

		int number = -9; 

		String result = (number >= -9 && number <= 9) ? "Single Digit Number"
				: (number >= -99 && number <= 99) ? "Double Digit Number" : "More than Double Digit Number";

		System.out.println(result);
	}
}

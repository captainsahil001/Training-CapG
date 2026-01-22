package oops.string;

public class BalancedParentheses {
	public static void main(String[] args) {

		String str = "(a+b)*(c-d)";
		int count = 0;
		boolean isBalanced = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				count++;
			} else if (ch == ')') {
				count--;
			}
			if (count < 0) {
				isBalanced = false;
				break;
			}
		}

		if (count != 0) {
			isBalanced = false;
		}
		if (isBalanced) {
			System.out.println("Balanced Parentheses");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
package stack;

import java.util.Stack;

public class PostfixEvaluator {
	public static int evaluatePostfix(String expr) {
		if (expr == null || expr.trim().isEmpty()) {
			throw new IllegalArgumentException("Expression is empty");
		}

		Stack<Integer> st = new Stack<>();
		String[] tokens = expr.trim().split("\\s+");

		for (String t : tokens) {
			if (isNumber(t)) {
				st.push(Integer.parseInt(t));
			} else {
				if (st.size() < 2)
					throw new RuntimeException("Invalid postfix expression");
				int b = st.pop();
				int a = st.pop();
				st.push(apply(a, b, t.charAt(0)));
			}
		}

		if (st.size() != 1)
			throw new RuntimeException("Invalid postfix expression");
		return st.pop();
	}

	private static boolean isNumber(String s) {
		if (s == null || s.isEmpty())
			return false;
		int i = (s.charAt(0) == '-') ? 1 : 0;
		if (i == s.length())
			return false;
		for (; i < s.length(); i++)
			if (!Character.isDigit(s.charAt(i)))
				return false;
		return true;
	}

	private static int apply(int a, int b, char op) {
		return switch (op) {
		case '+' -> a + b;
		case '-' -> a - b;
		case '*' -> a * b;
		case '/' -> {
			if (b == 0)
				throw new ArithmeticException("Division by zero");
			yield a / b;
		}
		default -> throw new RuntimeException("Unknown operator: " + op);
		};
	}

	public static void main(String[] args) {
		System.out.println(evaluatePostfix("2 3 1 * + 9 -")); // -4
		System.out.println(evaluatePostfix("10 5 / 7 +")); // 9
	}
}

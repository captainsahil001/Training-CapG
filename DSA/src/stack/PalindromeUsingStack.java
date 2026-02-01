package stack;

import java.util.Stack;

public class PalindromeUsingStack {
	public static boolean isPalindrome(String s) {
		if (s == null)
			return false;

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++)
			st.push(s.charAt(i));

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != st.pop())
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("madam")); // true
		System.out.println(isPalindrome("hello")); // false
	}
}

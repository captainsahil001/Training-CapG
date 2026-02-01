package arraysandstrings;

public class StringMethods {

	// 1) Find length of the string
	public static int getLength(String s) {
		if (s == null)
			return 0;
		return s.length();
	}

	// 2) Convert to uppercase
	public static String toUpper(String s) {
		if (s == null)
			return null;
		return s.toUpperCase();
	}

	// 2) Convert to lowercase
	public static String toLower(String s) {
		if (s == null)
			return null;
		return s.toLowerCase();
	}

	// 3) Extract a substring (start inclusive, end exclusive)
	public static String getSubstring(String s, int start, int end) {
		if (s == null)
			return null;
		if (start < 0 || end > s.length() || start > end) {
			throw new IllegalArgumentException("Invalid start/end for substring");
		}
		return s.substring(start, end);
	}

	// 4) Check whether a string is binary (only 0 and 1)
	public static boolean isBinaryString(String s) {
		if (s == null || s.isEmpty())
			return false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != '0' && ch != '1')
				return false;
		}
		return true;
	}

	// 5) Search for a pattern in a given string (returns first index, -1 if not
	// found)
	public static int searchPattern(String text, String pattern) {
		if (text == null || pattern == null)
			return -1;
		return text.indexOf(pattern); // built-in searching
	}

	// 6) Check whether a string is palindrome
	public static boolean isPalindrome(String s) {
		if (s == null)
			return false;

		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "HelloWorld";
		System.out.println("String: " + s);
		System.out.println("Length: " + getLength(s));
		System.out.println("Upper: " + toUpper(s));
		System.out.println("Lower: " + toLower(s));
		System.out.println("Substring(0,5): " + getSubstring(s, 0, 5)); // Hello

		String bin1 = "101010";
		String bin2 = "10102";
		System.out.println("\n" + bin1 + " is binary? " + isBinaryString(bin1));
		System.out.println(bin2 + " is binary? " + isBinaryString(bin2));

		String text = "sadbutsad";
		String pattern = "sad";
		System.out.println("\nText: " + text);
		System.out.println("Pattern: " + pattern);
		System.out.println("First match index: " + searchPattern(text, pattern));

		String p1 = "madam";
		String p2 = "hello";
		System.out.println("\n" + p1 + " palindrome? " + isPalindrome(p1));
		System.out.println(p2 + " palindrome? " + isPalindrome(p2));
	}

}

package oops.string;

public class StringCompression {
	 public static void main(String[] args) {

	        String str = "aaabbccc";
	        String result = "";

	        int count = 1;

	        for (int i = 0; i < str.length(); i++) {
	            // check next character
	            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            } else {
	                result = result + str.charAt(i) + count;
	                count = 1; // reset count
	            }
	        }
	        System.out.println(result);
	    }
	}
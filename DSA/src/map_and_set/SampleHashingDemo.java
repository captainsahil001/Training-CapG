package map_and_set;

import java.util.HashMap;
import java.util.Map;

public class SampleHashingDemo {
	public static void main(String[] args) {
		String content = "abdjccklbjckl";
		System.out.println(getIndex(content));
	}
	
	public static int getIndex(String string) {
		 Map<Character, Integer> map = new HashMap<>();

	        // Step 1: count frequency
	        for (char ch : string.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }

	        // Step 2: find first non-repeating character
	        for (int i = 0; i < string.length(); i++) {
	            if (map.get(string.charAt(i)) == 1) {
	                return i;
	            }
	        }
	        return -1;
	    }
		
	

}

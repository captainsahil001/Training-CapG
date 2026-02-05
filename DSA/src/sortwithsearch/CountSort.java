package sortwithsearch;

import java.util.Arrays;

public class CountSort {
	
	public static int[] countSort(int[] a) {
	    // Step 1: Find max element to size hash correctly
	    int max = Arrays.stream(a).max().getAsInt();
	    int[] hash = new int[max + 1];

	    // Step 2: Count frequencies
	    for (int i = 0; i < a.length; i++) {
	        hash[a[i]]++;
	    }

	    // Step 3: Rebuild sorted array
	    int[] result = new int[a.length];
	    int index = 0;
	    for (int i = 0; i < hash.length; i++) {
	        while (hash[i] > 0) {
	            result[index++] = i;
	            hash[i]--;
	        }
	    }

	    return result;
	}
	
}

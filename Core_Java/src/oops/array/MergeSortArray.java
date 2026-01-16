package oops.array;

public class MergeSortArray {
	public static int[] merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
	
	    int i = 0, j = 0, k = 0;
	
	    
	    while (i < a.length && j < b.length) {
	        if (a[i] <= b[j]) {
	            merged[k++] = a[i++];
	        } else {
	            merged[k++] = b[j++];
	        }
	    }
	
	    
	    while (i < a.length) {
	        merged[k++] = a[i++];
	    }
	
	    
	    while (j < b.length) {
	        merged[k++] = b[j++];
	    }
	
	    return merged;
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,6};
		int[] b = {2,4,7};
		int[] c= merge(a,b);
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i] + " ");
		}
	}

}

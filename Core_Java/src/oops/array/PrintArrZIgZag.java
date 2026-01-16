package oops.array;

public class PrintArrZIgZag {
	 public static void printZigZag(int[] a, int[] b) {

	        int maxLength = Math.max(a.length, b.length);

	        for (int i = 0; i < maxLength; i++) {

	            if (i < a.length) {
	                System.out.print(a[i] + " ");
	            }

	            if (i < b.length) {
	                System.out.print(b[i] + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr1 = {1, 3, 5, 7};
	        int[] arr2 = {2, 4, 6};

	        printZigZag(arr1, arr2);
	    }

}

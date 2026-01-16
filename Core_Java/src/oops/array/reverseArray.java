package oops.array;

public class reverseArray {
	public static void reverseArr(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = {2,3,4,5};
		reverseArr(a);
		
	}

}

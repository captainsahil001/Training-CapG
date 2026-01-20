package oops.array.assignment;

public class Ex4   // sum of elements of an array 
{
	public static void sumOfElements(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] a = {3,4,5,6};
		sumOfElements(a);
	}

}

package oops.array.assignment;

public class Ex1 {
	public static void printAll(int[] a) {
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		printAll(a);
	}

}

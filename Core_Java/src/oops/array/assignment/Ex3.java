package oops.array.assignment;

public class Ex3 {
	public static void printOddIndEle(int[] a) {
		for (int i=1;i<a.length;i+=2) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		printOddIndEle(a);
	}
}

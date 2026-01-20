package oops.array.assignment;

public class Ex2  //print even index elements 
{
	public static void printEvenEle(int[] a) {
		for(int i=0;i<a.length;i+=2) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		printEvenEle(a);
	}
}

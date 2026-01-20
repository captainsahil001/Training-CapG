package oops.array.assignment;

public class Ex3   //print odd index elements 
{
	public static void printOddEle(int[] a) {
		for(int i=1;i<a.length;i+=2) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		printOddEle(a);
	}
}

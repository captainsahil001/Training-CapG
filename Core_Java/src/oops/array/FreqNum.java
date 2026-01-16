package oops.array;

public class FreqNum {
	public static void frequency(int[] a,int num) {
		int count = 0;
		for(int i =0; i<a.length;i++) {
			if(a[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int[] a = {2,2,4,2,6};
		frequency(a,2);
	}
}

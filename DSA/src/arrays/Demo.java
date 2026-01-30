package arrays;

import java.util.Arrays;

public class Demo {
	public static int[] reverse(int[] a) {
		int[] res = new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			res[j] = a[i];
			j++;
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(Arrays.toString(reverse(a)));
		
		
		
		
	}

}

package sortwithsearch;

import java.util.Arrays;

public class Merge2SortedArray {
	
	public static int[] merge(int[]arr1,int[]arr2) {
		int[]ans = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
			}
			else {
				ans[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			k++;i++;
		}
		while(i<arr2.length) {
			ans[k]=arr2[j];
			k++;j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[]arr1 = {1,2,5,7,9};
		int[]arr2 = {2,3,4,6,8};
		
		System.out.println(Arrays.toString(merge(arr1,arr2)));
		
	}
	
}

package sortwithsearch;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int[]arr = {1,2,2,0,1,0,1,0};
		int start=0; int mid=0; int end = arr.length-1;
		while(mid<=end) {
			if(arr[mid]==0) {
				int temp=arr[start];
				arr[start]=arr[mid];
				arr[mid]=temp;
				mid++;
				start++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[end];
				arr[end]=arr[mid];
				arr[mid]=temp;
				end--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
				
	}
	
}

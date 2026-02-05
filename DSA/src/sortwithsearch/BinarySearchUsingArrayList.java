package sortwithsearch;

import java.util.ArrayList;

public class BinarySearchUsingArrayList {

	public static int binarySearchArrayList(ArrayList<Integer>a,int k) {
		int low=0;int high=a.size()-1;
		while(low<=high) {
			int mid=((high-low)/2)+low;
			if(a.get(mid)==k) {
				return mid;
			}
			else if(mid<k) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(binarySearchArrayList(a, 4));
		
		// get ->O(1) return generic type
		// indexOf ->O(n) 
		// add ->return boolean argument passed is generic O(1) is amortized tc but worst case it will be O(n)
		System.out.println(binarySearchArrayList(a, 8));
		
	}
	
}

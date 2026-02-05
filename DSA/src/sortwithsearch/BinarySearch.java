package sortwithsearch;

public class BinarySearch {

	public static int binarySearch(int[]a,int k) {
		int low=0;int high=a.length-1;
		while(low<=high) {
			int mid=((high-low)/2)+low;
			if(a[mid]==k) {
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
		int[]a= {1,2,3,4,5,6,7};
		System.out.println(binarySearch(a, 4));
		System.out.println(binarySearch(a, 8));
		
	}
	
}

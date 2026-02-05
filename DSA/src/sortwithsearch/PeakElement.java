package sortwithsearch;

public class PeakElement {
	
	public static int peakElement(int[]a) {
		int ans=0;
		for(int i=1;i<a.length-1;i++) {
			if(a[i-1]<a[i] && a[i]>a[i+1]) {
				ans=a[i];
			}
		}

		return ans;
	}
	
	public static int maxElement(int[]a) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static int peakElementBS(int[]a) {
		int low=0;
		int high=a.length-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			if(a[mid]<a[mid+1]) {
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return a[low];
	}

	public static void main(String[] args) {
		int[]a= {1,2,3,4,3,2,1};
		int[]a1= {1,2,3,4,5,6};
		System.out.println(peakElement(a));
		System.out.println(maxElement(a1));
		
		System.out.println(peakElementBS(a));
		System.out.println(peakElementBS(a1));
		
	}
	
}

package sortwithsearch;

public class LinearSearch {

	public int linearSearch(int[]arr,int k) {
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				ans=i;
				return ans;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		LinearSearch l = new LinearSearch();
		int[]a = {1,2,3,2,1,4,5,6,7};
		System.out.println(l.linearSearch(a,4));
		System.out.println(l.linearSearch(a,8));
	}
	
}

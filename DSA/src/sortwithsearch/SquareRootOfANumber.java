package sortwithsearch;

public class SquareRootOfANumber {

	public static int squareRoot(int n) {

		int low = 2;int high=n/2;
		for(int i =low;i<=high;i++) {
			if(i*i==n) {
				return i;
			}
		}
		return 1;
	}
	
	public static int squareRootN(int n) {
		
		for(int i =1;i*i<=n;i++) {
			if(i*i==n) {
				return i;
			}
		}
		return 1;
	}
	
	public static int squareRootBS(int n) {
		int ans=0;
		int low=1;int high=n;
		
		while(low<=high) {
			long mid= (low+high)/2;
			if(mid*mid<=n) {
				ans=(int)mid;
				low=(int)mid+1;
			}
			else {
				high=(int)mid-1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(squareRoot(36));
		System.out.println(squareRootN(36));
		System.out.println(squareRootBS(36));
		
	}
	
}

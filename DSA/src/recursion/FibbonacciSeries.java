package recursion;

public class FibbonacciSeries {
	
	public static long fibonacciInIndex(long n) {
		long start=0;long next=1;long ans=0;
		if(n==0) {
			return start;
		}
		if(n==1) {
			return next;
		}
		for(int i=2;i<=n;i++) {
			ans=start+next;
			start=next;
			next=ans;
		}
		return ans;
	}
	
	public static long fibonacciRecursion(long n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
	}
	
	public static long fibonacciRecursionDp(int n) {
	        if (n <= 1) return n;
	        long[] dp = new long[(n+1)];
	        dp[0] = 0;
	        dp[1] = 1;
	        for (int i = 2; i <= n; i++) {
	            dp[i] = dp[i-1] + dp[i-2];
	        }
	        return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacciInIndex(6));
		System.out.println(fibonacciRecursion(6));
		
		
		System.out.println(fibonacciInIndex(50));
		System.out.println(fibonacciRecursionDp(50));
		System.out.println(fibonacciRecursion(50));

	}

}

package recursion;

public class Fibonacci_IndexBased {
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		int prev =0, curr =1;
		for(int i=2;i<=n;i++) {
			int next = prev + curr;
			prev = curr;
			curr = next;
		}
		return curr;
	}
	public static void main(String[] args) {
		int a=4;
		System.out.println(fibo(a));
	}
}

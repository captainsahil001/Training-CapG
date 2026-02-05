package sortwithsearch;

public class Power {

	public static long power(long a, long n) {
		if(n==1) {
			return a;
		}
		return a*power(a,n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}
	
}

package timeandspaceComp;

public class Prime {
	public static int countFactors(int N) {
		int count =0;
		for(int i=1;i*i<=N;i++) {
			if(N%i==0) {
				if (i == N / i)
                    count++;     
                else
                    count += 2;
			}
		}
		return count;
		
	}
	public static boolean isPrime(int n) {
		if(countFactors(n) == 2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a =18;
		System.out.println(isPrime(a));
	}

}

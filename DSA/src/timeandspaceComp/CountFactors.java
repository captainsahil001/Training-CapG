package timeandspaceComp;

public class CountFactors {
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
	public static void main(String[] args) {
		int a = 24;
		System.out.println(countFactors(a));
	}

}

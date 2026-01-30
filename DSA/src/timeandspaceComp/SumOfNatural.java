package timeandspaceComp;

public class SumOfNatural {
	public static int sumOfNat(int a) {
		int sum = 0;
		for(int i=0;i<=a;i++) {
			sum = sum + i;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int a = 6;
		System.out.println(sumOfNat(a));
	}

}

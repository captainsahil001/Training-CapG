package loop;

public class OddNo {
	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		while(m<=n) {
			if(m%2 != 0) {
				System.out.println(m);
			}
			m++;
		}
	}
}

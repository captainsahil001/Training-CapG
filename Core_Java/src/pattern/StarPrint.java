package pattern;

public class StarPrint {
	public static void p1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	public static void p2(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	public static void p3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void p4(int n) {
		
	}
	public static void main(String[] args) {
		p1(3);
		p2(3);
		p3(3);
	}

}

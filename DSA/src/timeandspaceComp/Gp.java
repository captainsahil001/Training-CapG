package timeandspaceComp;

public class Gp {
	public static void printGP(int a, int r, int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int a = 3;
		int r = 2;
		int n = 5;
		printGP(a,r,n);
	}
}

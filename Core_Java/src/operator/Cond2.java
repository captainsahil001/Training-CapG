package operator;

public class Cond2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String res = (a>b && a>c)?"A greatest":(b>c)?"B Greatest":"C is Greatest";
		System.out.println(res);
	}
}

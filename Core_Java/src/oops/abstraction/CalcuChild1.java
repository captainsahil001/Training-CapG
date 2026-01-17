package oops.abstraction;

public class CalcuChild1 extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int multi(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Calculator c =new CalcuChild1();
		System.out.println(c.add(5, 5));
		System.out.println(c.multi(5, 5));
		System.out.println(c.sub(5, 5));
	}
}

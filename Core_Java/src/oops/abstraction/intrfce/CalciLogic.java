package oops.abstraction.intrfce;

public class CalciLogic implements Calci {
	@Override
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	@Override
	public void multi(int a,int b) {
		System.out.println(a*b);
	}
	@Override
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
	

}

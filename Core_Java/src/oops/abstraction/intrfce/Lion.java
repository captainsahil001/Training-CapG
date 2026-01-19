package oops.abstraction.intrfce;

public class Lion implements Animal{
	@Override
	public void sound() {
		System.out.println("Lion Roars");
	}
	@Override
	public void color() {
		System.out.println("Lion is Brown");
	}

}

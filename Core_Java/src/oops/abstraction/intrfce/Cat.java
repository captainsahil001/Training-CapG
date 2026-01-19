package oops.abstraction.intrfce;

public class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Cat Meows");
	}
	@Override
	public void color() {
		System.out.println("Cat is White");
	}

}

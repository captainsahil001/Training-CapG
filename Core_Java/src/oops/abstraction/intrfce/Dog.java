package oops.abstraction.intrfce;

public class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Dog Barks");
	}

	@Override
	public void color() {
		System.out.println("Dog is Black");

	}
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		dog.color();
		System.out.println("------------------");
		
		Dog d = new Dog();
		d.sound();
		d.color();
		System.out.println("------------------");

		
		Dog a = (Dog)dog;
		a.color();
		a.sound();
		System.out.println("------------------");

	}
}

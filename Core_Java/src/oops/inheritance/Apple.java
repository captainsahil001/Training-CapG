package oops.inheritance;

public class Apple extends Fruit {
	double price;
	
	
	public Apple(String color,String name,double price) {
		this.color=color;
		this.name = name;
		this.price=price;
	}
	public static void main(String[] args) {
		Apple a = new Apple("RED","Kashmiri",120);
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.price);
		
	}

}

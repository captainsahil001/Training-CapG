package oops.inheritance;

public class Fruit {
	String color;
	String name;
	Fruit(){
		
	}
	public Fruit(String color,String name){
		this.color = color;
		this.name=name;
	}
	public static void main(String[] args) {
		Fruit f = new Fruit("BLUE","Mumbai");
		System.out.println(f.color);
		System.out.println(f.name);
//		System.out.println(f.price);
	}

}

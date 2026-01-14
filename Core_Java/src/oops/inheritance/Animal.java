package oops.inheritance;

public class Animal {
	String name;
	String color;
	int legs;
	
	public void printAnimal() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(legs);
	}
	public static void main(String[] args) {
		Dog d = new Dog("Suzu","Black",4);
		d.printAnimal();
		Animal a = new Animal();
		a.name = "Shiro";
		a.color = "Brown";
		a.legs = 4;
		a.printAnimal();
		
	}

}
class Dog extends Animal {
	Dog(String name, String color, int legs){
		this.name = name;
		this.color=color;
		this.legs= legs;
	}
}

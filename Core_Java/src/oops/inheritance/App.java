package oops.inheritance;

public class App {
	String name;
	double size;
	App(){}
	App(String name,double size){
		this.name= name;
		this.size=size;
	}
	public static void main(String[] args) {
		App a = new App("Insta",128);
		System.out.println(a.name);
		System.out.println(a.size);
	}

}

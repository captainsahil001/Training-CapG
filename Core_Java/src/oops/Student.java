package oops;

public class Student {
	int id;
	String name;
	public void initialize(int id,String name ) {
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		s.initialize(2, "XYZ");
		s.display();
	}

}

package oops.collframe;

public class Student {

	int id;
	String name;
	public float marks;
	
	public Student(int id,String name, float f) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "id : "+id+" name : "+name;
	}
	
}

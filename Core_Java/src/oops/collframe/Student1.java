package oops.collframe;

public class Student1 {
	
	int id;
	String name;
	float marks;
	
	public Student1() {
		
	}
	
	public Student1(int id,String name,float marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "id: "+id+" name: "+name+" marks: "+marks;
	}

	
}

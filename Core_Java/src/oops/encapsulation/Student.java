package oops.encapsulation;

public class Student {
	String name;
	private int pass;
	
	public Student () {
		
	}
	public Student(String name,int pass) {
		this.name = name;
		this.pass = pass;
	}
	
	public int getPass() {
		return pass;
	}
	public void setpass(int pass) {
		this.pass=pass;
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Raju";
		s.setpass(123);
		System.out.println(s.name);
		System.out.println(s.getPass());
		
		Student s2 = new Student("XYZ",321);
		System.out.println(s2.getPass());
		System.out.println(s2.name);
		}

}

package oops.abstraction.intrfce;

public class StudentDriver {
	public static void main(String[] args) {
		English e = new English();
		Student s = new Student();
		s.setResult(e);
		e.marks();
		e.grade();
		
		Maths m = new Maths();
		s.setResult(m);
		m.marks();
		m.grade();
	}
}

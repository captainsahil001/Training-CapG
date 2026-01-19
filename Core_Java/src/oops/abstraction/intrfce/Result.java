package oops.abstraction.intrfce;

public interface Result {
	void marks();
	void grade();
	
}

class English implements Result{
	
	public void marks() {
		System.out.println("Result of English");
	}
	public void grade() {
		System.out.println("Grade of English");
	}
}
class Maths implements Result{
	public void marks() {
		System.out.println("Result of Maths");
	}
	public void grade() {
		System.out.println("Grade of Maths");
	}
}

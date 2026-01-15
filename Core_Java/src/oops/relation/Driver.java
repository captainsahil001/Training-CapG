package oops.relation;

public class Driver {
	public static void main(String[] args) {
		
	
		College c = new College();
		Trainer t = new Trainer();
		Student s = new Student();
		c.setName("IEM");
		c.setLocation("Kolkata");
		c.setStudent(s);
		c.setTrainer(t);
		
		s.setId(100);
		s.setName("Sahil");
		
		t.setName("Sandip");
		t.setSubject("JAVA");
		
		c.printInfo();
	}
}

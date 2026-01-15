package oops.relation;

public class College {
	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.student.getId());
		System.out.println(this.student.getName());
		System.out.println(this.trainer.getName());
		System.out.println(this.trainer.getSubject());
	}
}

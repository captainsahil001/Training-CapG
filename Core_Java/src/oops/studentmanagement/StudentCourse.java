package oops.studentmanagement;

public class StudentCourse {
	public void showStudentCourseDetail(Student s) {
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getRollNumber());
		System.out.println(s.getGrade());
		System.out.println(s.getCourse().getCourseId());
		System.out.println(s.getCourse().getCourseName());
		
	}
	public static void main(String[] args) {
		StudentCourse sc = new StudentCourse();
		Student s = new Student();
		Course c = new Course();
		s.setName("Sahil");
		s.setAge(22);
		s.setRollNumber(20);
		s.setGrade(100);
		s.setCourse(c);
		c.setCourseId(22);
		c.setCourseName("English");
		
		sc.showStudentCourseDetail(s);
		
	}
	

}

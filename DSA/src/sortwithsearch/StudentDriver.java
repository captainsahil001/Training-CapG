package sortwithsearch;

import java.time.LocalDate;
import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] students = {
				new Student(1,"Dinga","dinga@gmail.com","male",LocalDate.of(2001, 1, 20)),
				new Student(2,"Lamda","lamdaa@gmail.com","male",LocalDate.of(2000, 2, 2)),
				new Student(3,"Lemdi","lemdi@gmail.com","female",LocalDate.of(2001, 6, 16)),
				new Student(4,"Genda","genda@gmail.com","male",LocalDate.of(2002, 4, 1)),
				new Student(5,"Gendi","gendi@gmail.com","female",LocalDate.of(2003, 9, 30)),
		};
		for(Student student:students) {
			System.out.println(student);
		}
		
//		System.out.println("-".repeat(100));
		System.out.println("------------------------------------------------------------------------------------");
		
		NameComparator nameComparator = new NameComparator();
		
		Arrays.sort(students,nameComparator);
		for(Student student:students) {
			System.out.println(student);
		}
		
	}

}

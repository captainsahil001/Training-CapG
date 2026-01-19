package oops.array.arrayId;
import java.util.Scanner;

public class StudentDriver {
	public static Student[] passStu(Student[] student) {
		int count = 0;
		Student[] temp = new Student[student.length];
		for(int i=0;i<student.length;i++) {
			Student s = student[i];
			if(s.marks>=35) {
				temp[count++] = s;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
//		Student[] students = new Student[3];
//		students[0] = new Student(10,"Virat",40);
//		students[1] = new Student(11,"Rohit",50);
//		students[2] = new Student(12,"Bumrah",30);
//		
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].id);
//			System.out.println(students[i].name);
//		}
//		for(Student s:students) {
//			System.out.println(s.id);
//			System.out.println(s.name);
//			
//		}
		

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            float marks = sc.nextFloat();

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\nPassed Students (Marks >= 35):");
        Student[] passed = passStu(students);

        for (Student s : passed) {
            if (s != null) {
                System.out.println(s.id + " " + s.name + " " + s.marks);
            }
        }

        sc.close();
    }
		
		
	
}

package Assignment;

import java.util.ArrayList;

public class DriverStudent {
	
	public static ArrayList<Student> filterPassedStudents(ArrayList<Student>s) {
		ArrayList<Student>ans = new ArrayList<Student>();
		for(Student a:s) {
			if(a.marks>=40f) {
				ans.add(a);
			}
		}
		return ans;
	}
	
	public static void findTopper(ArrayList<Student>s) {
		float max = s.get(0).marks;int index=0;
		for(Student a:s) {
			if(a.marks>max) {
				max= a.marks;
				index=s.indexOf(a);
			}
		}
		System.out.println(s.get(index));
		System.out.println("-------------------");
	}
	
	public static boolean searchStudentbyName(ArrayList<Student>s,String name) {
		boolean ans = false;
		for(Student a:s) {
			if(a.name == name) {
				ans=true;
				break;
			}
		}
		return ans;
	}
	
	public static void countPassFailStudents(ArrayList<Student>s) {
		int passCount=0;int total = s.size();
		for(Student a:s) {
			if(a.marks>=40f) {
				passCount++;
			}
		}

		System.out.println("Passed Students: "+passCount);
		System.out.println("Failed Students: "+(total - passCount));
		System.out.println("-------------------");
	}
	
	public static void printList(ArrayList<Student>s) {
		for(Student a:s) {
			System.out.println(a);
		}
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(10,"abc",45.23f));
		s.add(new Student(11,"bcd",46f));
		s.add(new Student(12,"cde",32.36f));
		s.add(new Student(13,"def",36.99f));
		s.add(new Student(14,"efg",48.12f));
		
		printList(s);
		
		printList(filterPassedStudents(s));
		
		findTopper(s);
		
		System.out.println(searchStudentbyName(s,"abc"));
		System.out.println(searchStudentbyName(s,"dbc"));
		System.out.println("-------------------");
		
		countPassFailStudents(s);
		
	}

}

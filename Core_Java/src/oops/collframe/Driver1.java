package oops.collframe;

import java.util.ArrayList;

public class Driver1 {
	
	public static void main(String[] args) {
		ArrayList<Student>s1= new ArrayList<Student>();
		s1.add(new Student(10,"xyz", 0));
		s1.add(new Student(11,"wxyz", 0));
		s1.add(new Student(12,"vwxyz", 0));
		
		Student s= new Student(13,"uvwxyz", 0);
		s1.add(s);
		
		System.out.println(s1);// it will show the address
	}

}

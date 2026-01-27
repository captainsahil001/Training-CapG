package oops.collframe;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {

		Stack<String> list = new Stack<>();

		list.push("Java");
		list.push("Python");
		list.push("C++");

		System.out.println("Top Element: " + list.peek());      //c++  (only for stack methods peek push pop empty and search)
		System.out.println("First element: " + list.get(0));    //java
		System.out.println("List: " + list);                    //all

		list.set(1, "JavaScript");
		System.out.println("List: " + list);

		list.pop();

		System.out.println("Updated List: " + list);
	}
}
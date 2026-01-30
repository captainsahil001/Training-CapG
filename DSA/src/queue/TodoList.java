package queue;

import java.util.LinkedList;
import java.util.Queue;

public class TodoList {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("Open eclipse");
		q.offer("Set Package");
		q.offer("Create class");
		q.offer("Write Code");
		q.offer("Execute it");
		
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}

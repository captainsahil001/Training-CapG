package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(1);
		pq.offer(6);
		pq.offer(8);
		pq.offer(9);
		pq.offer(2);
		pq.offer(0);
		
		System.out.println(pq);
		
		List<Integer> list = new ArrayList<>(pq.size());
		while(!pq.isEmpty()) {
			list.add(pq.poll());
		}
		
		System.out.println(list);
	}
}

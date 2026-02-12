package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequent {
	public static List<Integer> topKfreq(int[] num,int k){
		Map<Integer, Integer> freq = new HashMap<>();
        for (int x : num) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((o1,o2) -> freq.get(o1)- freq.get(o2));
        
        Set<Integer> key = freq.keySet();

        for(Integer element:key) {
        	pq.add(element);
        	if(pq.size()>2) {
        		pq.poll();
        	}
        }
        return new ArrayList<>(pq);
    }
	
	public static void main(String[] args) {
		int[] a = {1,2,1,1,2,2,4,1,4,6};
		System.out.println(topKfreq(a,3));
	}
}

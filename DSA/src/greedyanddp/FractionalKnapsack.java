package greedyanddp;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FractionalKnapsack {

	    static class Item {
	        int value, weight;
	        double ratio;
	        Item(int v, int w) {
	            value = v; weight = w;
	            ratio = (double) v / w;
	        }
	    }

	    public static double maxValue(Item[] items, int capacity) {
	        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> Double.compare(b.ratio, a.ratio));
	        pq.addAll(Arrays.asList(items));

	        double total = 0.0;
	        int cap = capacity;

	        while (cap > 0 && !pq.isEmpty()) {
	            Item it = pq.poll();
	            if (it.weight <= cap) {
	                cap -= it.weight;
	                total += it.value;
	            } else {
	                double frac = (double) cap / it.weight;
	                total += it.value * frac;
	                cap = 0;
	            }
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	        Item[] items = { new Item(60,10), new Item(100,20), new Item(120,30) };
	        System.out.println(maxValue(items, 50)); // 240.0
	    }
	


}

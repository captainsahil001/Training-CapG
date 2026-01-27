package oops.collframe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMapEntry {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(23, "A");
		map.put(50, "B");
		map.put(33, "C");
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
			
		}
		System.out.println("---------------------------------");
		
		//Iterator is used only with collection framework-> 
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {                           // hasnext points the cursor next has element or not but doesnt move the cursor
			System.out.println(i.next());              // whereas next moves the cursor forward and gets the element also.
		}
		System.out.println("---------------------------------");

		
		
		ListIterator<Integer> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("---------------------------------");

		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("---------------------------------");

	}
}

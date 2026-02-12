package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class TopKMax {
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
        	if(!pq.contains(nums[i])) {
        		pq.offer(nums[i]);
        	}
        }
        if(k == 1){
            return pq.peek();
        }
        else if(k>1){
            for(int i=1; i<k; i++){
                pq.poll();
            }
        }
        return pq.peek();
    }
	public static void main(String[] args) {
		int[] a = {1,2,1,3,2,2,4,6};
		System.out.println(findKthLargest(a, 2));
	}

}

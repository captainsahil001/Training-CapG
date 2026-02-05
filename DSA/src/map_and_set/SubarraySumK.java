package map_and_set;

import java.util.*;

//Input: nums = [1,2,3], k = 3
//Output: 2
//Subarrays: [1,2], [3]

public class SubarraySumK {
    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // Check if (sum - k) exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr, 3));
    }
}
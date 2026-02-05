package map_and_set;

import java.util.*;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {

        // Step 1: Store all numbers in HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Traverse each number
        for (int num : nums) {

            // Step 3: Check if it's start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 5: Update longest
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};//1234 ie 4
        System.out.println(longestConsecutive(arr));
    }
}
package map_and_set;

import java.util.*;

public class FirstDuplicate {
    public static int firstDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return num; // first duplicate
            }
            set.add(num);
        }
        return -1; // no duplicate
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(arr));
    }
}
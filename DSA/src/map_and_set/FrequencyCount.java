package map_and_set;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            // If num not present → get 0, then add 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
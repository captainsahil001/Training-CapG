package map_and_set;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert to char array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to string (key)
            String key = new String(chars);

            // Add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","tab","nat","bat"};
        System.out.println(groupAnagrams(words));
    }
}
package map_and_set;

import java.util.*;

public class Day5HashingAssignment {

    public static void main(String[] args) {

        System.out.println("===== PART A: Hashing Fundamentals =====");
        PartA.HashingNotes.printNotes();

        System.out.println("\n===== PART B: Core Hashing Problems =====");
        PartB.LongestConsecutiveSequence.demo();
        PartB.GroupAnagrams.demo();
        PartB.FirstDuplicateElement.demo();
        PartB.SubarraysSumEqualsK.demo();
        PartB.SmallestWindowContainsT.demo();
    }

    // ========================= PART A =========================
    static class PartA {

        static class HashingNotes {
            static void printNotes() {
                System.out.println("Hashing: converting data (key) into an index using a hash function.");
                System.out.println("Why preferred over brute-force?");
                System.out.println("- Many lookups become average O(1) instead of O(n).");
                System.out.println("- Used for frequency counting, duplicate detection, prefix sums, grouping, etc.");

                System.out.println("\nHash Table:");
                System.out.println("- Data structure that stores (key -> value) using hash index.");
                System.out.println("- Uses arrays internally + hashing to find bucket index quickly.");

                System.out.println("\nCollision Handling Techniques:");
                System.out.println("1) Chaining: each bucket stores a list/linked list of entries.");
                System.out.println("2) Open Addressing: find another slot when collision occurs (linear/quadratic probing, double hashing).");
            }
        }
    }

    // ========================= PART B =========================
    static class PartB {

        // ----------- 1) Longest Consecutive Sequence -----------
        static class LongestConsecutiveSequence {

            // O(n) average using HashSet
            static int longestConsecutive(int[] nums) {
                Set<Integer> set = new HashSet<>();
                for (int x : nums) set.add(x);

                int best = 0;
                for (int x : set) {
                    // start only when x-1 doesn't exist (start of sequence)
                    if (!set.contains(x - 1)) {
                        int cur = x;
                        int len = 1;
                        while (set.contains(cur + 1)) {
                            cur++;
                            len++;
                        }
                        best = Math.max(best, len);
                    }
                }
                return best;
            }

            static void demo() {
                int[] arr = {100, 4, 200, 1, 3, 2};
                System.out.println("\n1) Longest Consecutive Sequence:");
                System.out.println("Array: " + Arrays.toString(arr));
                System.out.println("Answer length = " + longestConsecutive(arr)); // 4 (1,2,3,4)
            }
        }

        // ---------------- 2) Group Anagrams ----------------
        static class GroupAnagrams {

            // Approach A: sorted key (easy)
            static List<List<String>> groupBySortedKey(String[] strs) {
                Map<String, List<String>> map = new HashMap<>();

                for (String s : strs) {
                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    String key = new String(ch);

                    map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
                }
                return new ArrayList<>(map.values());
            }

            // Approach B: frequency key (best for lowercase a-z)
            static List<List<String>> groupByFrequencyKey(String[] strs) {
                Map<String, List<String>> map = new HashMap<>();

                for (String s : strs) {
                    int[] freq = new int[26];
                    for (char c : s.toCharArray()) freq[c - 'a']++;

                    // build unique key like: a1#b0#c2...
                    StringBuilder key = new StringBuilder();
                    for (int f : freq) key.append(f).append('#');

                    map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
                }
                return new ArrayList<>(map.values());
            }

            static void demo() {
                String[] strs = {"eat","tea","tan","ate","nat","bat"};
                System.out.println("\n2) Group Anagrams:");
                System.out.println("Input: " + Arrays.toString(strs));

                System.out.println("Grouped (Sorted Key): " + groupBySortedKey(strs));
                System.out.println("Grouped (Freq Key)  : " + groupByFrequencyKey(strs));
            }
        }

        // ----------- 3) First Duplicate Element in Array -----------
        static class FirstDuplicateElement {

            // returns first duplicate encountered while scanning left->right
            static Integer firstDuplicate(int[] arr) {
                Set<Integer> seen = new HashSet<>();
                for (int x : arr) {
                    if (seen.contains(x)) return x;
                    seen.add(x);
                }
                return null; // no duplicate
            }

            static void demo() {
                int[] arr = {5, 3, 4, 3, 2, 1, 4};
                System.out.println("\n3) First Duplicate Element:");
                System.out.println("Array: " + Arrays.toString(arr));
                System.out.println("First duplicate = " + firstDuplicate(arr)); // 3
            }
        }

        // ----------- 4) Subarrays with Sum Exactly K -----------
        static class SubarraysSumEqualsK {

            // Prefix sum + HashMap frequency
            // Time O(n), Space O(n)
            static int countSubarraysSumK(int[] nums, int k) {
                Map<Integer, Integer> freq = new HashMap<>();
                freq.put(0, 1); // prefix sum 0 occurs once

                int prefix = 0;
                int count = 0;

                for (int x : nums) {
                    prefix += x;

                    // need prefix - k already seen
                    count += freq.getOrDefault(prefix - k, 0);

                    freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
                }
                return count;
            }

            static void demo() {
                int[] arr = {1, 2, 3, -2, 5, -3, 1};
                int k = 3;
                System.out.println("\n4) Subarrays with Sum Exactly K:");
                System.out.println("Array: " + Arrays.toString(arr) + ", k = " + k);
                System.out.println("Count = " + countSubarraysSumK(arr, k));
            }
        }

        // ----------- 5) Smallest Window containing all chars of t -----------
        static class SmallestWindowContainsT {

            // Sliding window + freq maps (ASCII 128)
            static String minWindow(String s, String t) {
                if (t.length() > s.length()) return "";

                int[] need = new int[128];
                int required = 0; // total required characters count (including duplicates)

                for (char c : t.toCharArray()) {
                    need[c]++;
                    required++;
                }

                int[] window = new int[128];
                int left = 0;
                int formed = 0;

                int bestLen = Integer.MAX_VALUE;
                int bestL = 0;

                for (int right = 0; right < s.length(); right++) {
                    char c = s.charAt(right);
                    window[c]++;

                    if (need[c] > 0 && window[c] <= need[c]) {
                        formed++;
                    }

                    // Try shrink while window is valid
                    while (formed == required) {
                        int len = right - left + 1;
                        if (len < bestLen) {
                            bestLen = len;
                            bestL = left;
                        }

                        char lc = s.charAt(left);
                        window[lc]--;
                        if (need[lc] > 0 && window[lc] < need[lc]) {
                            formed--;
                        }
                        left++;
                    }
                }

                return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + bestLen);
            }

            static void demo() {
                String s = "ADOBECODEBANC";
                String t = "ABC";
                System.out.println("\n5) Smallest Window Containing All Characters of Another String:");
                System.out.println("s = " + s);
                System.out.println("t = " + t);
                System.out.println("Min Window = " + minWindow(s, t)); // BANC
            }
        }
    }
}


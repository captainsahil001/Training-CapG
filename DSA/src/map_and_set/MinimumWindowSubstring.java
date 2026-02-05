package map_and_set;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freq = new int[128];

        // Store frequency of t
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char r = s.charAt(right);

            // If character needed
            if (freq[r] > 0) {
                count--;
            }
            freq[r]--;
            right++;

            // Valid window
            while (count == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;
                if (freq[l] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
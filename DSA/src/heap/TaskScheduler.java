package heap;

import java.util.Arrays;

public class TaskScheduler {
	public static int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency of tasks
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);

        int maxFreq = freq[25]; // highest frequency
        int maxCount = 1;

        // Count how many tasks have same max frequency
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == maxFreq)
                maxCount++;
            else
                break;
        }

        int partCount = maxFreq - 1;
        int partLength = n + 1;

        int minTime = partCount * partLength + maxCount;

        return Math.max(tasks.length, minTime);
    }

    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(leastInterval(tasks, n));
    }

}

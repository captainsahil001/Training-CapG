package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNonRepeatingStream {
	public static void processStream(String stream) {
        int[] freq = new int[256]; // ASCII
        Queue<Character> q = new ArrayDeque<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            freq[ch]++;
            q.offer(ch);

            while (!q.isEmpty() && freq[q.peek()] > 1) {
                q.poll();
            }

            if (q.isEmpty()) System.out.print("-1 ");
            else System.out.print(q.peek() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        processStream("aabcbde"); // a -1 b b -1 d d
    }
}

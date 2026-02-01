package stack;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreater(a))); // [5, 25, 25, -1]
    }
}

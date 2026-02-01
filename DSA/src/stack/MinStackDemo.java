package stack;

import java.util.Stack;

public class MinStackDemo {
	static class MinStack {
        private final Stack<Integer> data = new Stack<>();
        private final Stack<Integer> mins = new Stack<>();

        public void push(int x) {
            data.push(x);
            if (mins.isEmpty() || x <= mins.peek()) mins.push(x);
        }

        public int pop() {
            if (data.isEmpty()) throw new RuntimeException("Stack Underflow");
            int val = data.pop();
            if (val == mins.peek()) mins.pop();
            return val;
        }

        public int top() {
            if (data.isEmpty()) throw new RuntimeException("Stack is empty");
            return data.peek();
        }

        public int getMin() {
            if (mins.isEmpty()) throw new RuntimeException("Stack is empty");
            return mins.peek();
        }

        public boolean isEmpty() { return data.isEmpty(); }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(5);
        st.push(2);
        st.push(8);
        st.push(1);

        System.out.println(st.getMin()); // 1
        st.pop(); // remove 1
        System.out.println(st.getMin()); // 2
    }
}

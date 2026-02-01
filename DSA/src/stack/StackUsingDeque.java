package stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
	static class MyStack {
        private final Deque<Integer> dq = new ArrayDeque<>();

        public void push(int x) { dq.addFirst(x); }
        public int pop() {
            if (dq.isEmpty()) throw new RuntimeException("Stack Underflow");
            return dq.removeFirst();
        }
        public int peek() {
            if (dq.isEmpty()) throw new RuntimeException("Stack is empty");
            return dq.peekFirst();
        }
        public boolean isEmpty() { return dq.isEmpty(); }
        public int size() { return dq.size(); }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.peek()); // 30
        System.out.println(st.pop());  // 30
        System.out.println(st.pop());  // 20
        System.out.println(st.size()); // 1
    }
}

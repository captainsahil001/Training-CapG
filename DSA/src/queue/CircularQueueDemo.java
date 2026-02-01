package queue;

public class CircularQueueDemo {
	static class CircularQueue {
		private final int[] q;
		private int front, rear, size;

		public CircularQueue(int capacity) {
			if (capacity <= 0)
				throw new IllegalArgumentException("Capacity must be > 0");
			q = new int[capacity];
			front = 0;
			rear = -1;
			size = 0;
		}

		public boolean enqueue(int x) {
			if (isFull())
				return false;
			rear = (rear + 1) % q.length;
			q[rear] = x;
			size++;
			return true;
		}

		public int dequeue() {
			if (isEmpty())
				throw new RuntimeException("Queue Underflow");
			int val = q[front];
			front = (front + 1) % q.length;
			size--;
			return val;
		}

		public int peek() {
			if (isEmpty())
				throw new RuntimeException("Queue is empty");
			return q[front];
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public boolean isFull() {
			return size == q.length;
		}

		public int size() {
			return size;
		}
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(3);
		System.out.println(cq.enqueue(10)); // true
		System.out.println(cq.enqueue(20)); // true
		System.out.println(cq.enqueue(30)); // true
		System.out.println(cq.enqueue(40)); // false (full)

		System.out.println(cq.dequeue()); // 10
		System.out.println(cq.enqueue(40)); // true (wrap)
		System.out.println(cq.peek()); // 20
	}
}

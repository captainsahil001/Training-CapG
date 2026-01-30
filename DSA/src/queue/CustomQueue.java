package queue;

public class CustomQueue {
	private int size;
	private int[] queue;
	private int front;
	private int rear;
	
	public CustomQueue(int size) {
		this.size = size;
		queue = new int[size];
		this.front=0;
		this.rear=-1;
		
	}
	
	public boolean isFull() {
		return rear == size-1;
		}
	
	public int enqueue(int element) {
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		queue[++rear] = element;
		return element;
	}
	
	public boolean isEmpty() {
		return front>rear;
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty!__");
		}
		return queue[front++];
	}
	public int size() {
		return rear-front+1;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		return queue[front];
	}
	public static void main(String[] args) {
		CustomQueue q = new CustomQueue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.peek());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
	}

}

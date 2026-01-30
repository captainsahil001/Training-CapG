package stack;

public class CustomStack {
	int top;
	private int size;
	int stack [];
	public CustomStack(int size) {
		stack = new int[size];
		top =-1;
		this.size = size;
	}
	public CustomStack() {}
	
//	public int push(int data) {
//		return stack[++top] = data;
//	}
//	public int pop() {
//		return stack[top--];
//	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public int push(int element) {
		if(isFull()) {
			throw new RuntimeException("Stack Overflow");
		}
		stack[++top] = element;
		return element;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Overflow Exception");
		}
		return stack[top--];
	}
	public int size() {
		return top +1;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack Overflow Exception");
		}
		return stack[top];
	}

}


class Controller{
	public static void main(String[] args) {
		CustomStack stack = new CustomStack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
	} 
}

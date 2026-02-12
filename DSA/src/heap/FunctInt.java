package heap;

public class FunctInt {
	public static void main(String[] args) {
		
	}
	
	@java.lang.FunctionalInterface
	interface FunctionalInterface{
		void add();
		
		boolean equals(Object o);
		
		int hashCode();
		
		String toString();
		
		default void info() {
			System.out.println("It contains 1 abstract method and as many def and stat methods");
		}
		
		static void greet() {
			System.out.println("hello");
		}
	}

}

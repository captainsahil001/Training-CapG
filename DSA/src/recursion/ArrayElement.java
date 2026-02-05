package recursion;

public class ArrayElement {
	
	public static void printArray(int[]a,int index) {
		if(index==a.length-1) {
			System.out.println(a[index]);
			return;
		}
		System.out.println(a[index]);
		printArray(a, index+1);
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		printArray(a, 0);
	}

}

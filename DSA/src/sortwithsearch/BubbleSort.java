package sortwithsearch;

public class BubbleSort {

	// best case complexity of this code will also be O(n2) as of worst case
	public static int[] bubbleSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	// best case of this code O(n) and worst case will O(n2) as there is one check given
	public static int[] bubbleSortOptimal(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
		return arr;
	}
	
	public static void printArray(int[]a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,3,2,1};
		
		printArray(a);
		
		printArray(bubbleSort(a));
	}
	
}

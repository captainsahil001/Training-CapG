package sortwithsearch;

public class WaveArray {

	public static int[] waveArray(int[]a) {
		for(int i=0;i<a.length-1;i+=2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		return a;
	}
	
	public static void printArray(int[]a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		
		printArray(a);
		
		printArray(waveArray(a));
	}
	
}

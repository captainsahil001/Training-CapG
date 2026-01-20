package oops.array.assignment;

public class Ex5   //product of elements of a given array
{
	public static void prodOfElements(int[] a) {
		int p =1;
		for(int i=0;i<a.length;i++) {
			if(a[i] == 0) {
				p=0;
				
			}
			else {
				p = p*a[i];
			}
		}
		System.out.println(p);
	}
	public static void main(String[] args) {
		int[] a= {1,2,0,4};
		prodOfElements(a);
	}

}

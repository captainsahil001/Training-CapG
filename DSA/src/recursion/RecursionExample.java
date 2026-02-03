package recursion;

public class RecursionExample {
	public static void printnumber(int n)
	{
		if(n==0)
		{
			return;
		}
		//System.out.println(n); //prints reverse order
		printnumber(n-1);
		System.out.println(n); //prints in correct order
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnumber(6);
		System.out.println("=========");
		System.out.println(factorial(5));
		int [] arr={1,2,3,4,5};
		System.out.println("=========");
		printarray(arr,0);

	}

	private static void printarray(int[] arr,int index) {
		if(arr.length-1==index)
		{
			System.out.println(arr[index]);
			return;
		}
		System.out.println(arr[index]);
		printarray(arr,index+1);
	}


	private static int factorial(int n) {
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}

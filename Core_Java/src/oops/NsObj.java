package oops;

public class NsObj {
	{
		System.out.println("N-S 1");
	}
	{
		System.out.println("N-S 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		NsObj e1 = new NsObj();
		NsObj e2 = new NsObj();
		System.out.println("main end");
		
	}

}

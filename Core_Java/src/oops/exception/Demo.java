package oops.exception;

public class Demo {
	public static void main(String[] args) {
		System.out.println("hii");
		try {                                                  //interrupted exception
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println("Checked Exception caused");
		}
		System.out.println("bye");
		
		
		System.out.println("----------------------------");
		
		
		System.out.println("hii");
		try {                                                 //Class Not Found Exception
			Class.forName("arrayId.Student");
		} catch (ClassNotFoundException e) {
			System.out.println("class info is wrong");
		}
		System.out.println("bye");
		
		
		System.out.println("----------------------------");
		

	} 
}

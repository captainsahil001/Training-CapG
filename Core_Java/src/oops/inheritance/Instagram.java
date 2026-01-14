package oops.inheritance;

public class Instagram extends App{
	String type;
	public Instagram(String name,double size,String type){
		this.name= name;
		this.size= size;
		this.type=type;
	}
	public static void main(String[] args) {
		Instagram i = new Instagram("Instagram",128,"Social Media");
		System.out.println(i.name);
		System.out.println(i.size);
		System.out.println(i.type);
		
	}
}

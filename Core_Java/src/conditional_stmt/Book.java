package conditional_stmt;

public class Book {
	public static void main(String[] args) {
		String day = "Mon";
		switch(day) {
		case("Mon"):
		case("Thur"):
		case("Wed"):{
			System.out.println("Take English book");
		}
			break;
		case("Tues"):
		case("Sat"):{
			System.out.println("Take Java");
		}
			break;
		case("Fri"):{
			System.out.println("Take SQL");
		}
			break;
			default:{
				System.out.println("Enjoy");
			}
		}
	}

}

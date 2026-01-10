package conditional_stmt;

public class TypOfInp {
	public static void main(String[] args) {
		char c = '1';
		if ((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			System.out.println("It is Alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("It is Digit");
		}
		else {
			System.out.println("It is Special character");
		}
	}
}

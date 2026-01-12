package operator;

public class ConvertCase {
    public static void main(String[] args) {

        char ch = 'a';  

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);   
            System.out.println("Lowercase: " + ch);

        } else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);   
            System.out.println("Uppercase: " + ch);

        } else {
            System.out.println("Not an alphabet");
        }
    }
}


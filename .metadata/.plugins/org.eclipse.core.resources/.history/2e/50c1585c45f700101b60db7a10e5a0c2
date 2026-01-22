package Assignment_22th_January;

//Isogram: string with no repeating letters
public class Isogram {
	public static void main(String[] args) {

        String str = "Machine";
        str = str.toLowerCase();   // ignore case
        boolean isIsogram = true; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                isIsogram = false;
                break;
            }
        }

        if (isIsogram) {
            System.out.println("Isogram");
        } else {
            System.out.println("Not an Isogram");
        }
    }
}

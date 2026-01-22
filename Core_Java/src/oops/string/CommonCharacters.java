package oops.string;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "javascript";
        System.out.print("Common characters: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}

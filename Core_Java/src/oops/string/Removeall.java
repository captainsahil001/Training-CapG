package oops.string;

public class Removeall {
	public static void main(String[] args) {

        String str = "abc123def45";
        String result = str.replaceAll("\\d", "");

        System.out.println(result);
    }
}
package Assignment_22th_January;

public class MaxVowelWord {
	public static void main(String[] args) {

        String sentence = "I love programming";
        String[] words = sentence.split(" ");

        String maxVowelWord = "";
        int maxVowelCount = 0;
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            if (count > maxVowelCount) {
                maxVowelCount = count;
                maxVowelWord = word;
            }
        }
        System.out.println("Word with maximum vowels: " + maxVowelWord);
    }
}
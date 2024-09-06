public class Strings2 {
    public static void main(String[] args) {
        String word = "tEchnolOgies";
        int vowelCount = countVowels(word);
        System.out.println("Number of vowels in '" + word + "': " + vowelCount);
    }

    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        word = word.toLowerCase(); // Convert the word to lower case to make it case insensitive

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
                count++;
            }
        }

        return count;
    }
}

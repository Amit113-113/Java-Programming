public class SentenceModifier {

    public static void main(String[] args) {
        String input = "Anirban Amit";
        String output = returnTheModifiedSentence(input);
        System.out.println("Output: " + output);
    }

    public static String returnTheModifiedSentence(String input1) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int shift = word.length();
            StringBuilder modifiedWord = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    char shifted = (char) (base + (c - base + shift) % 26);
                    modifiedWord.append(shifted);
                } else {
                    modifiedWord.append(c);
                }
            }

            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(modifiedWord);
        }

        return result.toString();
    }
}

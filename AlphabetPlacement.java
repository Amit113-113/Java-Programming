import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlphabetPlacement {

    public static char[] placeTheAlphabets(int[] input1) {
        int n = input1.length;
        char[] result = new char[n];


        int[] sortedInput = input1.clone();
        Arrays.sort(sortedInput);


        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            positionMap.put(input1[i], i);
        }


        for (int i = 0; i < n; i++) {
            int smallestElement = sortedInput[i];
            int originalIndex = positionMap.get(smallestElement);
            result[originalIndex] = (char) ('a' + i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {4,5,-2,8,99,67};
        char[] output = placeTheAlphabets(input1);

        // Print the result array
        System.out.println(Arrays.toString(output));
    }
}

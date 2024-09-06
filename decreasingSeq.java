import java.util.*;
public class decreasingSeq {
    public static void main(String[] args) {
        int[] arr={11,3,1,4,7,8,12,2,3,7};
        int numberOfSequences = 0;
        int longestSequenceLength = 0;
        int currentSequenceLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                currentSequenceLength++;
            } else {
                if (currentSequenceLength > 1) {
                    numberOfSequences++;
                    longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
                }
                currentSequenceLength = 1;
            }
        }

        if (currentSequenceLength > 1) {
            numberOfSequences++;
            longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
        }
        System.out.println(numberOfSequences + longestSequenceLength );

    }
}

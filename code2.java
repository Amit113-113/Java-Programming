import java.util.*;

public class code2 {
    public static int sumofUncommonNumber(int[] input1, int[] input2) {
        // Step 1: Use HashSet to track numbers seen in input arrays
        Set<Integer> set = new HashSet<>();

        // Add all numbers from input1 to the set
        for (int num : input1) {
            set.add(num);
        }

        // Step 2: Remove numbers from input2 that are already in the set
        for (int num : input2) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        // Step 3: Calculate sum of uncommon numbers
        int sum = 0;
        for (int num : set) {
            sum += num;
        }

        // Step 4: Reduce sum to single digit
        while (sum >= 10) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }

        return sum;
}

    public static void main(String[] args) {
        int[] arr1={6,7,12,70,44};
        int[] arr2={8,6,70,44};
        System.out.println(sumofUncommonNumber(arr1,arr2));
    }

}

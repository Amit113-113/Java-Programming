import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PasswordGenerator2 {

    // Helper class to store numbers with their frequencies
    static class NumberFrequency {
        int number;
        int frequency;

        NumberFrequency(int number, int frequency) {
            this.number = number;
            this.frequency = frequency;
        }
    }

    // Function to find the password
    public static String findPassword(int[] input1, int input2) {
        // Frequency map to store count of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : input1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Use a priority queue to get the highest, second highest, and lowest frequencies
        PriorityQueue<NumberFrequency> maxHeap = new PriorityQueue<>(
                (a, b) -> b.frequency == a.frequency ? Integer.compare(b.number, a.number) : Integer.compare(b.frequency, a.frequency)
        );

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.add(new NumberFrequency(entry.getKey(), entry.getValue()));
        }

        // Part1: Number with the highest frequency (largest number if tied)
        NumberFrequency highest = maxHeap.poll();
        // Part2: Number with the second highest frequency (largest number if tied)
        NumberFrequency secondHighest = null;
        while (!maxHeap.isEmpty()) {
            NumberFrequency current = maxHeap.poll();
            if (current.frequency < highest.frequency) {
                secondHighest = current;
                break;
            }
        }
        // Part3: Number with the lowest frequency (smallest number if tied)
        PriorityQueue<NumberFrequency> minHeap = new PriorityQueue<>(
                (a, b) -> a.frequency == b.frequency ? Integer.compare(a.number, b.number) : Integer.compare(a.frequency, b.frequency)
        );
        minHeap.addAll(frequencyMap.entrySet().stream()
                .map(entry -> new NumberFrequency(entry.getKey(), entry.getValue()))
                .toList()
        );

        NumberFrequency lowest = minHeap.peek();

        // Handle case where second highest is not found
        if (secondHighest == null) {
            secondHighest = highest; // In case there's no second distinct frequency, use the same as highest
        }

        // Construct the password
        String password = String.format("%d%d%d", highest.number, secondHighest.number, lowest.number);
        return password;
    }

    public static void main(String[] args) {
        // Test cases
        int[] array1 = {12, 2, 36, 10, 217, 36, 5, 36, 15, 10};
        System.out.println("Password: " + findPassword(array1, array1.length)); // Expected output: (36)(10)(2)

        int[] array2 = {15, 123, 12, 45, 62, 77, 89, 23, 12, 14, 11,14,12,90, 89, 12};
        System.out.println("Password: " + findPassword(array2, array2.length)); // Expected output: (12)(89)(5)
    }
}

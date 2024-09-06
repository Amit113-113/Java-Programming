import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class passwordGenerator {

    public static int findPassword(int[] input1, int input2) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : input1) {
            countMap.put(num, (countMap.getOrDefault(num, 0)) + 1);
        }


        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                        if (!a.getValue().equals(b.getValue())) {
                            return b.getValue().compareTo(a.getValue()); // Descending frequency
                        } else {
                            return b.getKey().compareTo(a.getKey()); // Descending value
                        }
                    }
                }
        );

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                        if (!a.getValue().equals(b.getValue())) {
                            return a.getValue().compareTo(b.getValue()); // Ascending frequency
                        } else {
                            return a.getKey().compareTo(b.getKey()); // Ascending value
                        }
                    }
                }
        );

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            maxHeap.offer(entry);
            minHeap.offer(entry);
        }


        Map.Entry<Integer, Integer> maxEntry = maxHeap.poll();
        int part1 = maxEntry.getKey();


        Map.Entry<Integer, Integer> secondMaxEntry = null;
        while (!maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            if (entry.getValue() < maxEntry.getValue()) {
                secondMaxEntry = entry;
                break;
            }
        }
        int part2 = (secondMaxEntry != null) ? secondMaxEntry.getKey() : part1;


        Map.Entry<Integer, Integer> minEntry = minHeap.poll();
        int part3 = minEntry.getKey();


        String main= part1 + "" + part2 + "" + part3;
        int ans=Integer.parseInt(main);
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = {12, 2, 36, 10, 217, 36, 5, 36, 15, 10};
        int input2 = 10; // Number of elements in the array
        System.out.println(findPassword(input1, input2)); // Output: 36102
    }
}
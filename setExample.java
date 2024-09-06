import java.util.HashSet;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Trying to add duplicate elements
        set.add("apple");
        set.add("banana");

        // Printing the set
        System.out.println("Set elements: " + set);
    }
}

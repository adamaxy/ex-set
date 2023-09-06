import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet with days of the week (no guaranteed order)
        Set<String> hashSetDays = new HashSet<>();
        hashSetDays.add("Monday");
        hashSetDays.add("Tuesday");
        hashSetDays.add("Wednesday");
        hashSetDays.add("Thursday");
        hashSetDays.add("Friday");
        hashSetDays.add("Saturday");
        hashSetDays.add("Sunday");

        // Create a LinkedHashSet to preserve insertion order
        Set<String> linkedHashSetDays = new LinkedHashSet<>();
        linkedHashSetDays.add("Monday");
        linkedHashSetDays.add("Tuesday");
        linkedHashSetDays.add("Wednesday");
        linkedHashSetDays.add("Thursday");
        linkedHashSetDays.add("Friday");
        linkedHashSetDays.add("Saturday");
        linkedHashSetDays.add("Sunday");

        // Print the content of the HashSet
        System.out.println("HashSet (no guaranteed order):");
        for (String day : hashSetDays) {
            System.out.println(day);
        }

        // Print the content of the LinkedHashSet
        System.out.println("\nLinkedHashSet (preserves insertion order):");
        for (String day : linkedHashSetDays) {
            System.out.println(day);
        }

        // Check if the two Sets are equal
        boolean areEqual = hashSetDays.equals(linkedHashSetDays);

        // Print the answer to the question
        System.out.println("\nAre the two Sets equal? " + areEqual);
    }
}
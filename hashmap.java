import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Add elements to the HashMap
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        // Display the HashMap
        System.out.println("Students: " + students);

        // Access a value using a key
        System.out.println("Student with roll number 102: " + students.get(102));

        // Check if a key exists
        System.out.println("Is roll number 104 present? " + students.containsKey(104));

        // Remove an entry
        students.remove(101);
        System.out.println("After removal: " + students);

        // Iterate through the HashMap
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


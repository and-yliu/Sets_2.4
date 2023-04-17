import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Initialize an empty set to store unique words.
        Set<String> uniqueWords = new HashSet<>();
        try {
            // Loop through each token in the file by reading the next token, converting to lowercase, and removing
            // non-alphabetic characters. Add the token to the set if it is not already present.
            Scanner scanner = new Scanner(new File("illiad.txt"));
            while (scanner.hasNext()) {
                String token = scanner.next().toLowerCase();
                String word = token.replaceAll("[^A-Za-z]", "");
                uniqueWords.add(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Print the number of unique words in the file.
        System.out.println("Number of unique words in the Iliad: " + uniqueWords.size());
    }
}
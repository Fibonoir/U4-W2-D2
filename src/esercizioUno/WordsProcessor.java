package esercizioUno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordsProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the word: ");
            String word = scanner.nextLine();
            if (!words.add(word)) {
                System.out.println(!words.add(word));
                duplicates.add(word);
            }
        }

        System.out.println("The duplicates are: " + duplicates);
        System.out.println("The number of distinct words is: " + words.size());
        System.out.println("List of distinct words: " + words);
    }
}

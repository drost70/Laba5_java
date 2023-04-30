package ua.lviv.iot.algo.part1.lab5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static Set<String> findWordsInQuestionSentences(String text, int length) {
        String questionRegex = "\\?\\s*(\\b\\w+\\b\\s*)+";

        Set<String> words = new HashSet<>();
        Pattern questionPattern = Pattern.compile(questionRegex);
        Matcher matcher = questionPattern.matcher(text);
        while (matcher.find()) {
            String sentence = matcher.group();
            String[] sentenceWords = sentence.split("\\s+");
            for (String word : sentenceWords) {
                if (word.length() == length) {
                    words.add(word);
                }
            }
        }

        return words;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the word length: ");
        int length = scanner.nextInt();
        scanner.close();

        Set<String> words = findWordsInQuestionSentences(text, length);

        System.out.println("Words of the given length found in question sentences:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

package ua.lviv.iot.algo.part1.lab5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Word {


    public static Set<String> findWordsInQuestionSentences(String text, int length) {
        String questionRegex = "\\b\\w{" + length + "}\\b(?=[^?!.]*\\?)";

        Set<String> words = new HashSet<>();
        Pattern questionPattern = Pattern.compile(questionRegex);
        Matcher matcher = questionPattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group();
            words.add(word);
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

        Word word = new Word();
        Set<String> words = word.findWordsInQuestionSentences(text, length);

        System.out.println("Words of the given length found in question sentences:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}

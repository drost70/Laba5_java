package ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;
import java.util.Set;
import org.junit.Test;

public class MainTest {


    @Test
    public void testFindWordsInQuestionSentencesWithNoMatches() {
        String text = "This text does not contain any question sentences.";
        int length = 5;

        Set<String> words = Main.findWordsInQuestionSentences(text, length);

        assertEquals(0, words.size());
    }

    @Test
    public void testFindWordsInQuestionSentencesWithEmptyInput() {
        String text = "";
        int length = 3;

        Set<String> words = Main.findWordsInQuestionSentences(text, length);

        assertEquals(0, words.size());
    }

    @Test
    public void testFindWordsInQuestionSentencesWithLongWordLength() {
        String text = "What is your name? My name is John. How old are you? I am 25 years old.";
        int length = 10;

        Set<String> words = Main.findWordsInQuestionSentences(text, length);

        assertEquals(0, words.size());
    }

    @Test
    public void testFindWordsInQuestionSentencesWithNegativeWordLength() {
        String text = "What is your name? My name is John. How old are you? I am 25 years old.";
        int length = -3;

        Set<String> words = Main.findWordsInQuestionSentences(text, length);

        assertEquals(0, words.size());
    }
}

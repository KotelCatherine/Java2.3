package ru.geekbrains.java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework3Ex1 {

    public static void main(String[] args) {
        String[] wordsArray = new String[]{
                "Sun", "Son", "Flavor", "Flower", "Moon", "Food", "Flavor",
                "External", "Sun", "Console", "Moon", "Array", "Matrix", "Sun"
        };

        Arrays.sort(wordsArray);
        findUniqueWords(wordsArray);
    }

    public static void findUniqueWords(String[] wordsArray) {
        List<String> uniqueWords = new ArrayList<>();
        String strArray;
        System.out.println("----------Повторяющиеся слова в массиве----------");
        for (int i = 0; i < wordsArray.length; i++) {
            int count = 1;
            strArray = wordsArray[i];

            for (int j = 0; j < wordsArray.length; j++) {
                if (strArray.equals(wordsArray[j]) && j != i) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueWords.add(strArray);
            }

            if (i < wordsArray.length - 1) {
                if (count > 1 && !strArray.equals(wordsArray[i + 1])) {
                    System.out.println(strArray + ": " + count);
                }
            }

            if (i == wordsArray.length - 1) {
                System.out.println(strArray + ": " + count);
            }
        }
        printUniqueWords(uniqueWords);
    }

    public static void printUniqueWords(List<String> uniqueWords) {
        System.out.println("----------Список уникальных слов----------");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}

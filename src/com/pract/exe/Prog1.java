
package com.pract.exe;
public class Prog1 {
    public static void main(String[] args) {
        String input = "hello world this is a test";
        String result = processString(input);
        System.out.println("Processed string: " + result);
    }

    /**
     * This method processes the input string by incrementing each character in words
     * with an even number of vowels by 1.
     *
     * @param input The input string
     * @return The processed string
     */
    public static String processString(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (countVowels(word) % 2 == 0) {
                result.append(incrementWord(word)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    /**
     * This method counts the number of vowels in a word.
     *
     * @param word The input word
     * @return The count of vowels
     */
    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method checks if a character is a vowel.
     *
     * @param ch The character to check
     * @return true if the character is a vowel, false otherwise
     */
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    /**
     * This method increments each character in a word by 1.
     *
     * @param word The input word
     * @return The incremented word
     */
    public static String incrementWord(String word) {
        StringBuilder incrementedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            incrementedWord.append((char) (ch + 1));
        }
        return incrementedWord.toString();
    }
}

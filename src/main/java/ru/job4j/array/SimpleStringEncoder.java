package ru.job4j.array;

/**
 * String compression algorithm based on counting repeated characters (simple RLE).
 * Examples: "aaaabbbccd" -> "a4b3c2d", "ab" -> "ab".
 * Singles are not suffixed with 1.
 * @author Anton Serdyuchenko
 * @since 07.09.2025
 */
public class SimpleStringEncoder {
    /**
     * Compresses the input string by collapsing runs of the same character.
     * @param input - string for compression. Example: "aaaabbbccd".
     * @return      - compressed string. Example: "a4b3c2d".
     */
    public static String encode(String input) {
        StringBuilder result = new StringBuilder(input.length());
        char previousCharter = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentCharter = input.charAt(i);
            if (currentCharter == previousCharter) {
                counter++;
            } else {
                result.append(previousCharter).append(counter > 1 ? counter : "");
                previousCharter = currentCharter;
                counter = 1;
            }
        }
        result.append(previousCharter).append(counter > 1 ? counter : "");
        return result.toString();
    }
}

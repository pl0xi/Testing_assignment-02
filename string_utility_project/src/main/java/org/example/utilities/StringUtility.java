package org.example.utilities;

public class StringUtility {
    public static String reverse(String text)  {
        StringBuilder reversedString = new StringBuilder();
        for (int i = text.length()-1; i >= 0; i--) {
            reversedString.append(text.charAt(i));
        }

        return reversedString.toString();
    }

    public static String capitalize(String text) {
        StringBuilder capitalizedString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            capitalizedString.append(Character.toUpperCase(text.charAt(i)));
        }
        return capitalizedString.toString();
    }

    public static String lowercase(String text) {
        StringBuilder lowercaseString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            lowercaseString.append(Character.toLowerCase(text.charAt(i)));
        }
        return lowercaseString.toString();
    }
}

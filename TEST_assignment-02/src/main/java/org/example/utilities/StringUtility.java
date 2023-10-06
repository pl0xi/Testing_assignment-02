package org.example.utilities;

import jdk.jshell.spi.ExecutionControl;

public class StringUtility {
    public static String reverse(String text)  {
        StringBuilder reversedString = new StringBuilder();
        for (int i = text.length()-1; i >= 0; i--) {
            reversedString.append(text.charAt(i));
        }

        return reversedString.toString();
    }
}

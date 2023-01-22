package com.techatpark;

import java.util.Arrays;

public class Generalization {
    public String mask(String plainText) {
        if ((plainText != null) && (plainText.length() > 0) && (plainText.length() > 4)) {
            // mask everything after first 4 chars
            char[] tokenChars = plainText.toCharArray();
            plainText.getChars(0, 4, tokenChars, 0);
            Arrays.fill(tokenChars, 4, tokenChars.length, '*');
            return(new String(tokenChars));
        } else if (plainText.length() <= 4) {
            // nothing to mask
            return plainText;
        }
        // empty plainText
        return "";
    }
}

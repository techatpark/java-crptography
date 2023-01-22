package com.techatpark;

import org.junit.jupiter.api.Test;

class PseudonymTest {
    @Test
    void test() throws Exception {

        Pseudonym pseudonym = new Pseudonym();

        String plainText = "Idly";
        String secretKey = "secretKey";

        String cipherText = pseudonym.encrypt(plainText, secretKey);

        System.out.println("Plain Text: " + plainText);
        System.out.println("De-identification to Cipher Text => " + cipherText);
        System.out.println("Identification to plain Text => " + pseudonym.decrypt(cipherText, secretKey));
    }
}
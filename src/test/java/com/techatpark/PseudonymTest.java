package com.techatpark;

import org.junit.jupiter.api.Test;

class PseudonymTest {
    @Test
    void test() throws Exception {

        Pseudonym pseudonym = new Pseudonym();

        String plainText = "AES Encryption";
        String secretKey = "secretKey";

        String cipherText = pseudonym.encrypt(plainText, secretKey);
        String decryptedText = pseudonym.decrypt(cipherText, secretKey);

        /* Display the original message, encrypted message and decrypted message on the console. */
        System.out.println("Plain Text: " + plainText);
        System.out.println("Cipher Text: " + cipherText);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
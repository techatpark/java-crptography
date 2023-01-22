package com.techatpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnonymityTest {

    @Test
    void test() {
        Anonymity anonymity = new Anonymity();

        String plainText = "My password";

        System.out.println("Plain Text: " + plainText);
        System.out.println("De-identification (anonymity) to Cipher Text => " + anonymity.getHash(plainText));


    }
}
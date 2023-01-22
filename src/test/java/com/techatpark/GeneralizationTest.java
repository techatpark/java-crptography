package com.techatpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralizationTest {

    @Test
    void test() {
        Generalization generalization = new Generalization();

        String plainText = "49959 91234";

        System.out.println("Plain Text: " + plainText);
        System.out.println("De-identification (masked) to Cipher Text => " + generalization.mask(plainText));
    }
}
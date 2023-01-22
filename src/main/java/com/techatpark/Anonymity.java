package com.techatpark;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Anonymity {
    public String getHash(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");


            return toHexString(md.digest(plainText.getBytes(StandardCharsets.UTF_8)));
        }


        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String toHexString(byte[] hash)
  {
    // Convert byte array into signum representation
    BigInteger number = new BigInteger(1, hash);
  
    // Convert message digest into hex value
    StringBuilder hexString = new StringBuilder(number.toString(16));
  
    // Pad with leading zeros
    while (hexString.length() < 64)
    {
      hexString.insert(0, '0');
    }
  
    return hexString.toString();
  }
}

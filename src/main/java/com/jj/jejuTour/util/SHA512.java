package com.jj.jejuTour.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class SHA512 {

    public String Salt() {
        String salt = "";

        try {
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            byte[] bytes = new byte[16];
            random.nextBytes(bytes);
            salt = new String(Base64.getEncoder().encode(bytes));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return salt;
    }

    public String SHA512(String pwd, String hash) {
        String salt = hash + pwd;
        String hex = "";

            try {
                MessageDigest msg = MessageDigest.getInstance("SHA-512");
                msg.update(salt.getBytes());

                hex = String.format("%128x", new BigInteger(1, msg.digest()));

            } catch (Exception e){
             e.printStackTrace();
            }

        return hex;
    }

}

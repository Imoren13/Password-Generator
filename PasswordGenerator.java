//**********************************************************
// PasswordGenerator.java
//
// Generates a password that is ten characters long using
// symbols, numbers, and characters.
//**********************************************************

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(generatePassword(length));
    }

    static String generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        for(int i = 0; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }

        return new String(password);
    }
}

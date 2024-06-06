package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));

    }

    public static boolean checkForPalindrome(String str) {
        Locale.setDefault(new Locale("en", "GB"));
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        return str.equals(reverseStr);
    }

    public static String convertDecimalToBinary(Integer input) {
        int remainder;
        String binaryNum = "";
        while (input > 0) {
            remainder = input % 2;
            binaryNum = remainder + binaryNum;
            input = input / 2;
        }
        return binaryNum;
    }
}
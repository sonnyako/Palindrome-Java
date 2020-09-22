package com.company;

public class Main {

    public static void main(String[] args) {
        final String text = "Кот - арбузу браток";
        String textPalindrome = text.replaceAll("\\s+", "").replaceAll("([?!:;,– -«»])", "");
        StringBuilder stringBuilder = new StringBuilder(textPalindrome).reverse();
        String invertedPalindrome = stringBuilder.toString();
        if (invertedPalindrome.equalsIgnoreCase(textPalindrome)) {
            System.out.println("Поліндром");

        } else {
            System.out.println("Не поліндром");
        }
    }
}

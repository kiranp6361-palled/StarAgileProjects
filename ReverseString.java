package com.corejava;

public class ReverseString{

    public static void main(String[] args) {
        String original = "Hello World";

        StringBuilder sb = new StringBuilder(original);
        String reversedWithFunction = sb.reverse().toString();
        System.out.println("Reversed (with reverse()): " + reversedWithFunction);

        String reversedWithoutFunction = reverseManually(original);
        System.out.println("Reversed (without reverse()): " + reversedWithoutFunction);
    }

    
    public static String reverseManually(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i]; 
        }
        return result;
    }
}


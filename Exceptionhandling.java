package com.corejava;

public class Exceptionhandling {
	
	    private static String text;

		public static void main(String[] args) {
	        try {
	            int[] numbers = {10, 20, 30};
	            System.out.println(numbers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is out of bounds!");
	        }

	        try {
	            text = null;
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Null value encountered!");
	        }

	        System.out.println("Program executed successfully.");
	    }
	}



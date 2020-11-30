package com.string;

import java.util.Scanner;

public class StringCalculator3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
			System.out.println(StringCalculator4.add(numbers));
	}

//Add method to handle new lines between numbers
	public static int add(final String numbers) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(",|n");
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}


}
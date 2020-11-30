package com.string;

import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
			System.out.println(StringCalculator.add(numbers));
	}

	public static int add(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",");
		if (numbersArray.length > 2) {
			throw new RuntimeException("Only Up to 2 numbers separated by comma (,) are allowed");
		}
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) { // After refactoring
				returnValue += Integer.parseInt(number);
			}
		}
		return returnValue;
	}


}
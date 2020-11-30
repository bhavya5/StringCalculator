package com.string;

import java.util.Scanner;

public class StringCalculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
			System.out.println(StringCalculator2.add(numbers));
	}



//Add method to handle unknown amount of numbers
	public static int add(final String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",");
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				returnValue += Integer.parseInt(number);
			}
		}
		return returnValue;
	}

}
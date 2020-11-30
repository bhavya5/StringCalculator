package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalculator5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
			System.out.println(StringCalculator5.add(numbers));
	}

	public static int add(final String numbers) {
	    String delimiter = ",|n";
	    String numbersWithoutDelimiter = numbers;
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
	    }
	    return add(numbersWithoutDelimiter, delimiter);
	}
	
	
//Add method to throw an exception for negative numbers
	  private static int add(final String numbers, final String delimiter) {
	        int returnValue = 0;
	        String[] numbersArray = numbers.split(delimiter);
	        List negativeNumbers = new ArrayList();
	        for (String number : numbersArray) {
	            if (!number.trim().isEmpty()) {
	                int numberInt = Integer.parseInt(number.trim());
	                if (numberInt < 0) {
	                    negativeNumbers.add(numberInt);
	                }
	                returnValue += numberInt;
	            }
	        }
	        if (negativeNumbers.size() > 0) {
	            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
	        }
	        return returnValue;     
	    }



}
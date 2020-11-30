package com.string;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest5{
	@Test(expected = RuntimeException.class)
	public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
	    StringCalculator5.add("3,-6,15,18,46,33");
	}
	@Test
	public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
	    RuntimeException exception = null;
	    try {
	        StringCalculator5.add("3,-6,15,-18,46,33");
	    } catch (RuntimeException e) {
	        exception = e;
	    }
	    Assert.assertNotNull(exception);
	    Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}
}

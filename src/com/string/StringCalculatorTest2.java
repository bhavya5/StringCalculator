package com.string;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest2{
@Test
public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
    Assert.assertEquals(3+6+15+18+46+33, StringCalculator2.add("3,6,15,18,46,33"));
}
}


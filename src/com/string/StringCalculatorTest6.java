package com.string;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest6{
@Test
public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
    Assert.assertEquals(3+1000+6, StringCalculator6.add("3,1000,1001,6,1234"));
}
}
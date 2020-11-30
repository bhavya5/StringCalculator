package com.string;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest4{
@Test
public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
    Assert.assertEquals(3+6+15, StringCalculator4.add("//;n3;6;15"));
}
}

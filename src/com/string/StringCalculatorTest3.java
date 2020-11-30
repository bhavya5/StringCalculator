package com.string;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest3{
@Test
public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
    Assert.assertEquals(3+6+15, StringCalculator3.add("3,6n15"));
}
}

package com.assignment.test;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import com.assignment.numbers.NumberConverter;

public class NumberConverterTest {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void convertNumber() {
		NumberConverter numberConverter = new NumberConverter();
		assertTrue(numberConverter.convertToString("777", new Scanner(System.in)));
	}
}

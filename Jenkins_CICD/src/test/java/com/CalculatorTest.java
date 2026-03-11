package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testAddition() {
		Calculator calc = new Calculator();
		int result = calc.add(2,3);
		assertEquals(5, result);
	}
}

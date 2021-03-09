package com.nackademin.teau.lectures_demos_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	

	@Test
	public void testAddition() {
		assertEquals(c.addition(2, 1), 3, 0);
	}

}

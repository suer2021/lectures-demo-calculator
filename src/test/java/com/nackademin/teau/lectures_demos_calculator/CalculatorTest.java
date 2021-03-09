package com.nackademin.teau.lectures_demos_calculator;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	
	@Test
	public void testAddition() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			LOG.info("Testing the method addition with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
			assertEquals(c.addition(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		}
		
		
	}
	
	@Test
	public void testSubtraction() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			LOG.info("Testing the method subtraction with the values: "+ tempFirstNumber + " and "+ tempSecondNumber);
			assertEquals(c.subtraction(tempFirstNumber, tempSecondNumber), tempExpectedResult, 0);
		}
		
		
	}

}

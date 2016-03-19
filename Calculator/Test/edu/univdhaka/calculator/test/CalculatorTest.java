package edu.univdhaka.calculator.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import edu.univdhaka.calculator.Calculator;

public class CalculatorTest {

	
	private Calculator calculator;
	
	@Before
	public void setUp() throws Exception {
		
		calculator=new Calculator();
	}

	@Test
	public void testAdd() {
		int a=3,b=5;
		int result=a+b;
		//fail("Not yet implemented");
		Assert.assertEquals(result, calculator.add(a,b));
	}

	
}

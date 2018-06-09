package com.ptc.devops;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	
	private static Calc c1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 c1 = new Calc();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		c1 = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int i = c1.add(10,  20);
		assertTrue("add", i==30);
	}

	@Test
	public void testDivide() {
		int i = c1.divide("100",  "20");
		assertTrue("divide 100,20", i==5);
	}
	
	@Test
	public void testDivideByZero() {
		try {
			int i = c1.divide("100",  "0");
		} catch (ArithmeticException ex) {
			assertTrue("divide 100,0", true);
		}
	}
	 
	@Test
	public void testDivideNonNumeric() {
		try {
			int i = c1.divide("efe",  "0");
		} catch (NumberFormatException ex) {
			assertTrue("divide efe", true);
		}
	}
}

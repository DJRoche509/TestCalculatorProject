package com.testingdocs.calculator;

//Arrange_Act_Assert pattern
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {
	Calculator objCalcUnderTest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//Arrange
		objCalcUnderTest = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void testCalculator() {
		fail("Not yet implemented"); // TODO
	}
	*/

	@Test
	void testAdd() {
		int a = 15; int b = 20;
		int expectedResult = 35;
		
		//Act
		int result = objCalcUnderTest.add(a, b);
		//Assertions
		Assertions.assertEquals(expectedResult, result);
	}

	@Test
	void testSubtract() {
		int a = 25; int b = 20;
		int expectedResult = 5;
		
		int result = objCalcUnderTest.subtract(a, b);
		Assertions.assertEquals(expectedResult, result);
	}

	@Test
	void testMultiply() {
		int a = 17; int b = 32;
		long expectedResult = 544 ;
		long result = objCalcUnderTest.multiply(a, b);
		Assertions.assertEquals(expectedResult, result);
	}

	@Test
	void testDivide() {
		int a = 55; int b = 8;
		double expectedResult = 6.875;
		double result = objCalcUnderTest.divide(a, b);
		Assertions.assertEquals(expectedResult, result);
	}

}

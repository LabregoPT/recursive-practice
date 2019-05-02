package ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {

	private final static int TOTAL_TEST = 10;
	
	@Test
	void factorialTest() {
		for(int i = 0; i<TOTAL_TEST; i++) {
			long expectedResult = 1;
			for(int j=2; j<=i; j++) {
				expectedResult *= j;
			}
			long actualResult = RecursiveFunctions.factorial(i);
			assertTrue(expectedResult == actualResult, "Factorial function failed");
		}
	}
	
	@Test
	void fibonacciTest() {
		long test10= 55;
		long test25= 75025;
		long test37= 24157817;
		
		assertTrue(test10 == RecursiveFunctions.fibonacci(10), "Fibonacci function failed");
		assertTrue(test25 == RecursiveFunctions.fibonacci(25), "Fibonacci function failed");
		assertTrue(test37 == RecursiveFunctions.fibonacci(37), "Fibonacci function failed");
	}
	
	void arraySummatoryTest() {
		long first = 15;
		long[] aFirst = {1,9,5};
		assertTrue(first == RecursiveFunctions.arraySummatory(aFirst, aFirst.length-1), "Array Summatory function failed");
		
		long second = 27;
		long[] aSecond = {10,5,6,2,4};
		assertTrue(second == RecursiveFunctions.arraySummatory(aSecond, aSecond.length-1), "Array Summatory function failed");
		
		long third = 135;
		long[] aThird = {2,3,7,6,9,6,25,14,11,50,2};
		assertTrue(third == RecursiveFunctions.arraySummatory(aThird, aThird.length-1), "Array Summatory function failed");
	}
}

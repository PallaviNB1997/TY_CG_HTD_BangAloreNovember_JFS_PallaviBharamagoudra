package com.capgemini.junit.junit_five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.junit.junit_five.Calculator;

class TestCalculator {
	Calculator c=null;
	@BeforeEach
	void createObject() {
		c = new Calculator();
	}


	@Test
	void testAdd() {
		Calculator c=new Calculator();
		int i=c.add(10, 5);
		assertEquals(15, i);
		//fail("Not yet implemented");
	}
	@Test
	void testAddNegative() {
		Calculator c = new Calculator();
		int i =c.add(-2, 5);
		assertEquals(3, i);
	}
	
	@Test
	void testMul() {
		Calculator c = new Calculator();
		int i = c.mul(2, 3);
		assertEquals(6, i);
	}
	
	@Test
	void testDiv() {
		Calculator c = new Calculator();
		int i = c.div(10, 2);
		assertEquals(5, i);
	}
	
	@Test
	void testFindLength() {
		Calculator c = new Calculator();
		int res = c.findLength("pallu");
		assertEquals(5, res);
	
	}
	@Test
	void testFindLengthForNull() {
		Calculator c = new Calculator();
		assertThrows(NullPointerException.class,
				()->{
			c.findLength(null);
		}
		);
	}
	
	@Test
	void testDivisionOfArithmeticException() {
		Calculator c = new Calculator();
		assertThrows(ArithmeticException.class, ()->{
			c.div(10, 0);
		}
		);
		
	}

}

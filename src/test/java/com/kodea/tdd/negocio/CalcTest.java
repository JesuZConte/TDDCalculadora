package com.kodea.tdd.negocio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CalcTest {

		@Test
		public void checkInstance(){
			//arrange
			Calc calculadora;
			
			//act
			calculadora = new Calc();
			
			//assert
			assertNotNull(calculadora);
		}
		
		@Test
		public void checkAddTwoIntegers(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = 1;
			int val2 = 20;
			
			//act
			double resultado = calculadora.add(val1, val2);
			
			//assert
			assertEquals(21, resultado, 0.1);
			
		}
		
		@Test
		public void checkSubstractTwoIntegers(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = 53;
			int val2 = 34;
			
			//act
			double resultado = calculadora.substract(val1, val2);
			
			//assert
			assertEquals(19, resultado, 0.1);
		}
		
		@Test
		public void checkSubstractNegativePositiveInteger(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = -53;
			int val2 = 34;
			
			//act
			double resultado = calculadora.substract(val1, val2);
			
			//assert
			assertEquals(-87, resultado, 0.1);
		}
		
		@Test
		public void checkSubstractNegativeIntegers(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = -53;
			int val2 = -34;
			
			//act
			double resultado = calculadora.substract(val1, val2);
			
			//assert
			assertEquals(-19, resultado, 0.1);
		}
	
		@Test
		public void checkMultiplicationTwoIntegers(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = 3;
			int val2 = 4;
			
			//act
			double resultado = calculadora.mult(val1, val2);
			
			//assert
			assertEquals(12, resultado, 0.1);
		}
		
		@Test
		public void checkDivision(){
			//arrange
			Calc calculadora;
			calculadora = new Calc();
			int val1 = 8;
			int val2 = 4;
			
			//act
			double resultado = calculadora.division(val1, val2);
			
			//assert
			assertEquals(2, resultado, 0.1);
		}
		
		@Test (expected = ArithmeticException.class)
		public void checkDividedByZero(){
			Calc calculadora;
			calculadora = new Calc();
			int val1 = 10;
			int val2 = 0;
			calculadora.division(val1, val2);
		}
		
}

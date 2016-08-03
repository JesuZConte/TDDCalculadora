package com.kodea.tdd.negocio;

public class Calc {

	
	public Calc(){
		
	}
	
	public double add(int valorUno, int valorDos){
		return valorUno + valorDos;
	}
	
	public double substract(int valorUno, int valorDos){
		return valorUno - valorDos;
	}
	
	public double mult(int valorUno, int valorDos){
		return valorUno * valorDos;
	}
	
	public double division(int valorUno, int valorDos){
		if(valorDos == 0){
			throw new ArithmeticException("El divisor no puede ser 0");
			//throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return valorUno / valorDos;
	}
}

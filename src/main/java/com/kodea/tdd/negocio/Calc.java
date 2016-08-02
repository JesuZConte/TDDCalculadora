package com.kodea.tdd.negocio;

public class Calc {

	
	public Calc(){
		
	}
	
	public int add(int valorUno, int valorDos){
		return valorUno + valorDos;
	}
	
	public int substract(int valorUno, int valorDos){
		return valorUno - valorDos;
	}
	
	public int mult(int valorUno, int valorDos){
		return valorUno * valorDos;
	}
	
	public double division(int valorUno, int valorDos){
		if(valorDos == 0){
			throw new ArithmeticException();
		}
		return valorUno / valorDos;
	}
}

package com.kodea.tdd.negocio;

import org.springframework.stereotype.Service;

@Service
public class Calc implements ICalc {

	
	public Calc(){
		
	}
	
	public double add(double valorUno, double valorDos){
		return valorUno + valorDos;
	}
	
	public double substract(double valorUno, double valorDos){
		return valorUno - valorDos;
	}
	
	public double mult(double valorUno, double valorDos){
		return valorUno * valorDos;
	}
	
	public double division(double valorUno, double valorDos){
		if(valorDos == 0){
			throw new ArithmeticException("El divisor no puede ser 0");
			//throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return valorUno / valorDos;
	}
}

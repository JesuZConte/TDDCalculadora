package com.kodea.tdd.app;

import java.util.Scanner;

import com.kodea.tdd.negocio.Calc;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String operacion = "";
		boolean continuar = false;
		Calc calculadora = new Calc();
		int numeroUno = 0;
		int numeroDos = 0;
		double resultado = 0;
		
		do
		{
		System.out.println("Por favor, elija operación a realizar: +, -, *, /");
		operacion = scanner.next();
		if(operacion.trim().equals("+") || operacion.trim().equals("-") || operacion.trim().equals("*") || operacion.trim().equals("/")){
			continuar = true;
			}
		}
		while(!continuar);
		
		if(operacion.trim().equals("+") || operacion.trim().equals("-") || operacion.trim().equals("*") || operacion.trim().equals("/"))
			
			System.out.println("Por favor, ingrese el primer número");
			if(scanner.hasNextInt()){
				numeroUno = scanner.nextInt();
				System.out.println("Por favor, ingrese el segundo número");
				if(scanner.hasNextInt()){
					numeroDos = scanner.nextInt();
					
					switch(operacion){
					case "+": 
						resultado = calculadora.add(numeroUno, numeroDos);
						break;
					case "-":
						resultado = calculadora.substract(numeroUno, numeroDos);
						break;
					case "*":
						resultado = calculadora.mult(numeroUno, numeroDos);
						break;
					case "/":
						resultado = calculadora.division(numeroUno, numeroDos);
						break;
						
					}
					System.out.println("El resultado es: " + resultado);	
				}
				else{
					System.out.println("El valor ingresado debe ser un número");
				}
			}
			else{
				System.out.println("El valor ingresado debe ser un número");
			}

			
			
			/*if(operacion.trim().equals("+")){			
				resultado = calculadora.add(numeroUno, numeroDos);
			}
			else if(operacion.trim().equals("-")){
				resultado = calculadora.substract(numeroUno, numeroDos);
			}
			else if(operacion.trim().equals("*")){
				resultado = calculadora.mult(numeroUno, numeroDos);
			}
			System.out.println("El resultado es: " + resultado);
			*/
			
			/*while(numeroDos == 0)
			{
				System.out.println("El segundo número debe ser distinto a 0. Ingrese el segundo número");
				numeroDos = scanner.nextInt();
			}*/
			//resultado = calculadora.division(numeroUno, numeroDos);
			
			
	}
}

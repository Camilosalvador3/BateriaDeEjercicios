package BateriaDeEjercicio;

import java.util.Scanner;

public class VariablesNumericas {
	
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		
		int ValorA;
		int ValorB;
		int ValorC;
		System.out.println("******Este Programa pide el valor para ambas variables e intercambia su valor******");
		System.out.println("Escriba el valor para A: ");
		ValorA = lector.nextInt();
		System.out.println("Escriba el valor para B: ");
		ValorB = lector.nextInt();
		
		
		// Realizamos los calculos 
		ValorC = ValorA;
		ValorA = ValorB;
		ValorB = ValorC;
		
		System.out.println("Tras el cambio, Valor A= " + ValorA + " y Valor B = " + ValorB);
			
	}

}

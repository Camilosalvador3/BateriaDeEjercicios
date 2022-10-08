package BateriaDeEjercicio;

import java.util.Scanner;

public class RaizCuadrada {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		double pot, raiz;
		
		System.out.println("Digite el Número");
		num =  lector.nextInt();
		if (num > 0) 
		{
			pot = num^2;
			raiz = Math.sqrt(num);
			System.out.println("Su Potencia Es: " + pot );
			System.out.println("Su Raíz Es: " + raiz);
		}
		else 
		{
			System.out.println("ERROR, DEBE INTRODUCIR UN NÚMERO MAYOR QUE 0");
			return;
		}
		

	}

}

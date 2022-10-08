package BateriaDeEjercicio;

import java.util.Scanner;

public class TresDigitos {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int número1;
		int número2;
		int número3;
		int resultado = 0;
		System.out.println("Digite el primer Número: ");
		número1 = lector.nextInt();
		System.out.println("Digite el segundo Número: ");
		número2 = lector.nextInt();
		System.out.println("Digite el tercer Número: ");
		número3 = lector.nextInt();
		
		
		if (número1 < 0) 
		{  
			resultado = número1*número2*número3;
			System.out.println("El resultado sera: " + resultado ); 
		}
		else 
		{		
			resultado = número1+número2+número3;
			System.out.println("El resultado es: " + resultado );
		}		

	}

}

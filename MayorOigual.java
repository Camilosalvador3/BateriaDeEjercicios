package BateriaDeEjercicio;

import java.util.Scanner;

public class MayorOigual {

	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
		int a; 
		int b;
		 System.out.println("Ingrese el valor para A: ");
		 a = lector.nextInt();
		 System.out.println("Ingrese el valor para B: ");
		 b = lector.nextInt();
		 if (a==b)
			 System.out.println("Los Números Son Iguales");
		 if (a>b)
			 System.out.println("El Número Mayor Es: " + a );
		 if (b>a)
			 System.out.println("El Número Mayor Es: " + b);
		
		
		

	}

}

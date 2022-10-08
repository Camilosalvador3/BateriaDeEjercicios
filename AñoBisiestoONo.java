package BateriaDeEjercicio;

import java.util.Scanner;

public class AñoBisiestoONo 
{
	public static void main(String[] args) 
	{
	
		int anio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el anio a evaluar: ");
		anio = entrada.nextInt();
		
		if( anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) 
		{
			System.out.println("El anio: " + anio + " es bisiesto");
		}else 
		{
			System.out.println("El anio: " + anio + " no es un anio bisiesto.");
		}
		
entrada.close();
	}

}

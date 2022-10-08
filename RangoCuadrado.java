package BateriaDeEjercicio;

import java.util.Scanner;

public class RangoCuadrado {
	
	static  Scanner teclado = new Scanner(System.in);
	int inicio, fin, cuadrado;
	public void entraDatos()
	{
		System.out.print("Por favor ingrese el inicio del Rango: ");
		inicio = teclado.nextInt();
		System.out.print("Por favor ingrese el fin del Rango: ");
		fin = teclado.nextInt();
	}
	public void proceso() 
	{
		for (int i = inicio; i <= fin; i++) 
		{
			System.out.println(Math.pow(i, 2));
		}
	}
	public static void main(String[] args) 
	{
		RangoCuadrado fc = new RangoCuadrado();
		fc.entraDatos();
		fc.proceso();

	}

}

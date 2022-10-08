package BateriaDeEjercicio;

import java.util.Scanner;

public class PorcentajeDeAlumnos 
{
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		int nh, nm, totalAlumnos;
		double  ph, pm;
		System.out.println("Ingrese la cantidad de niños del aula: ");
		nh = lector.nextInt();
		System.out.println("Ingrese la cantidad de niñas del aula: ");
		nm = lector.nextInt();
		
		totalAlumnos = nh + nm;
		ph = (nh * 100)/totalAlumnos;
		pm = (nm * 100)/totalAlumnos;
		System.out.println("El Total De Alumnos Es: " + totalAlumnos );
		System.out.println("El Porcentaje De Niños Es De: " + ph + "%");
		System.out.println("El Porcentaje De Niñas Es De: " + pm + "%");
					
	}

}

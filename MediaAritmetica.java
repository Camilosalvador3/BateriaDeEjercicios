package BateriaDeEjercicio;

import java.util.Scanner;

public class MediaAritmetica {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int  sumaDatos=0,dato=30,cont=0;
		
	

		System.out.println("--------------Calculadora de media aritmetica--------------");
		System.out.println("El numero 0 no puede ser ingresado");
		System.out.println("-1 para terminar el programa");
		System.out.println("---------------------------------------------");
			
			while(dato >= 1) 
			{
				cont++;
				System.out.print("Dato " + cont + ": ");
				dato = in.nextInt();
				sumaDatos = sumaDatos + dato;
				if(dato == -1) 
				{
					int st = sumaDatos+1;
					System.out.println("La suma total de los datos es: " + st);
					int div = cont-1;
					System.out.print("el total de numeros ingresados es: " + div + "\n");
					System.out.println("La media es: " + (st/div));
					System.out.println("---------------------------------------");
					System.out.println("Fin del programa");
					break;
				}
			}

		
			in.close();
		}

	}



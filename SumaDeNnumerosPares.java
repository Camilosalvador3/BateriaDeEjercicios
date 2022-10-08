package BateriaDeEjercicio;

import java.util.Scanner;

public class SumaDeNnumerosPares 
{

	public static void main(String[] args) 
	{
	
		int num = 1, cont = 1, suma=0;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un  numero: ");
		num = in.nextInt();
		
		while(cont <= num) 
		{
			if( num % 2 == 0) 
			{
				suma = suma + num;
				cont = cont + 1;
			}
			num = num + 1;
		}
		
		System.out.println(num);
		
		in.close();
	}
}



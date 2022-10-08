package BateriaDeEjercicio;

import java.util.Scanner;

public class ParOImpar {

	static Scanner lector = new Scanner(System.in);
	public static int num;
	public static void main(String[] args) {
		 
		IngresarNum();
		
		if (num > 0) 
		{
			if (num%2==0)
			    System.out.println("El número es par");
			else
			    System.out.println("El número es impar");
		}
		
		  /*else if (num == 0) 

		{
			System.out.println("El numero no es par ni impar");
			IngresarNum();
				
		}*/

	}
	
	public static void IngresarNum() 
	{
		System.out.println("Digite El Número:");
		num = lector.nextInt();
		
		if (num == 0) 
		{
			System.out.println("El numero no es par ni impar");
			IngresarNum();
		}
	}

}

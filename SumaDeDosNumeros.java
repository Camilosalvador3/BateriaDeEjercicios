package BateriaDeEjercicio;

import java.util.Scanner;

public class SumaDeDosNumeros 
{

	public static void main(String[] args) 
	{
		Scanner en = new Scanner(System.in);
		
	int n1,n2,n3;
	
	System.out.print("Introduzca el primer numero: ");
	n1 = en.nextInt();
	System.out.print("Introduzca el primer numero: ");
	n2 = en.nextInt();
	System.out.print("Introduzca el primer numero: ");
	n3 = en.nextInt();
		
	if(n1 + n2 == n3) 
	{
		System.out.println("Los numeros [" + n1 + "] ["+ n2 + "] son iguales a num3 que es: " + n3);
	}else 
	{
		System.out.println("Los numeros [" + n1 + "] ["+ n2 + "] son diferentes a num3 que es: " + n3);
	}
	
		en.close();

	}
}

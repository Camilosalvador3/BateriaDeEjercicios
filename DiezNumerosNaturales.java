package BateriaDeEjercicio;

import java.util.Scanner;

public class DiezNumerosNaturales 
{
 
	

		public static void main(String[] args) 
		{	
			Scanner en = new Scanner(System.in);
			int c=0,cont=0,cont2=0,aux=0,media=0;
			System.out.println("Escriba el numero 0 para terminar");

			

			do 
			{
				System.out.print("Ingrese el numero: ");
				c = en.nextInt();
				
				if(c % 2 == 0) 
				{
					cont = cont + 1;
				}else 
				{
					aux = aux + c;
					cont2 = cont2 + 1;
					media = (aux/cont2);
				}
			}while(c != 0);

			System.out.print("Los numeros pares son "+(cont-1) + "\n" );
			System.out.print("Los numeros impares son: "+cont2 + "\n");
			System.out.println("La suma de los numeros impares es: " + aux);
			System.out.println("La media es: " + media);
			
			
			en.close();

		}

}

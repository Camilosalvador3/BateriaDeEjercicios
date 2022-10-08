package BateriaDeEjercicio;

import java.util.Scanner;

public class NumerosEnteros 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		int max=0, min=0;
		double media = 0;
		int x = 1, num, cantnum=0,suma=0;
		
		boolean vf = true; 
		while(x != 0) 
		{
			System.out.print("Escribe un numero: ");
			num = in.nextInt();
			suma = suma+num;
			cantnum++;
			if(vf == true) 
			{
				max = num;
				min = num;
				vf = false;
			}else 
			{
				if(num > max) 
				{
					max = num;
				}else 
				{
					if(num <min && min == 0) 
					{
						min=num;
					}
				}
			}
			
			if(num == 0) 
			{
				x = num;
			}
			
		}
		
		if(cantnum == 0) {
			System.out.println("No se puede calcular la media");
		}else 
		{
			cantnum = cantnum -1;
			media = suma/cantnum;
			System.out.println("La media es: "+ media);
		}
		System.out.println("La suma total de los numeros es: "+suma);
		System.out.println("La cantidad de numeros registrados es: "+cantnum);
		System.out.println("El numero maximo es: "+max);
		System.out.println("El numero minimo es: "+min);
		
		in.close();
		
		}

	}

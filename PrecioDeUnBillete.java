package BateriaDeEjercicio;

import java.util.Scanner;

public class PrecioDeUnBillete 
{
	public static void main(String[] args) 
	{	
		Scanner en = new Scanner(System.in);
		
		int estadia;
		double precioVuelo,distancia,descuento,pFinal;
		
		System.out.println("Ingrese la distancia que quiere recorrer: ");
		distancia = en.nextDouble();
		System.out.println("Ingrese los dias de estadia");
		estadia = en.nextInt();
		
		precioVuelo = distancia*8.50;
		descuento = (precioVuelo*30)/100;
		
		if(distancia > 1000 && estadia > 7) 
		{
			pFinal = precioVuelo - descuento;
			System.out.println("El pago total es: " + pFinal + " dolares");
		}else {
			System.out.println("el pago total es: " + precioVuelo + " dolares");
		}
		
		
		en.close();
		
		
	}

}

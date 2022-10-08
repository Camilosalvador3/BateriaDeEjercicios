package BateriaDeEjercicio;

import java.util.Scanner;

public class TiendaElBuenPastor {
	
	static Scanner lector = new Scanner (System.in);
	public static void main(String[] args) {
		double importe, total;
		String mes;
		
		System.out.println("Escribe el importe de la compra: ");
		importe = lector.nextDouble();
		System.out.println("Introduce el mes: ");
		mes = lector.next();
		if((mes.equals("Febrero"))) 
		{
			total = importe*0.15;
		}else 
		{
			total = importe;
		}
		System.out.println("El Total De Su Compra Es: " + total );
	}

}

package BateriaDeEjercicio;

import java.util.Scanner;

public class GradoSuperior {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String RespBachillerato, PruebAcceso;
		
		System.out.println("¿Usted Tiene el bachillerato?");
		RespBachillerato = sc.next();
		RespBachillerato = RespBachillerato.toLowerCase();
		
		if( RespBachillerato.contains("si")) 
		{
			System.out.println("Usted puede acceder al grado superior");
			return;
		} 
		else if( RespBachillerato.contains("no")) 
		{
			System.out.println("¿Tienes la prueba de acceso aprobada?");
			PruebAcceso = sc.next();
			PruebAcceso = PruebAcceso.toLowerCase(); 
			
			
			if (PruebAcceso.contains("si") ) 
			{
				System.out.println("¡Felicidades! Usted puede cursar el grado superior");
			}
			else if (PruebAcceso.contains("no")) 
			{
				System.out.println("¡Lo sentimos! NO PUEDE CURSAR EL GRADO SUPERIOR");
				
			}
		}
		
	}

}

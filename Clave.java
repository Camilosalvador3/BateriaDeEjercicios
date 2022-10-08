package BateriaDeEjercicio;

import java.util.Scanner;

public class Clave 
{

	public static void main(String[] args) 
	{
		
		
		int cont=0;
		String correctPass = "tuani";
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese su Contraseña");
		System.out.println("__________________________");
		cont++;
		System.out.print("Intento No." + cont);
		String pass = in.nextLine();

		
		if(pass.equals(correctPass)) 
		{
			System.out.println("__________________________");
			System.out.println("Contraseña correcta");
			System.out.println("Fin");
			System.out.println("__________________________");
		}else 
		{
		
			while(!pass.equals(correctPass) && cont <3) 
			{
				cont++;
				System.out.println("Contraseña incorrecta");
				System.out.println("__________________________");
				System.out.print("Intento No. " + cont + " ");
				pass = in.nextLine();

				if(pass.equals(correctPass)) 
				{
					System.out.println("__________________________");
					System.out.println("Contraseña correcta");
					System.out.println("Fin");
					System.out.println("__________________________");
					break;
				}
			}
			System.out.println("__________________________");
			System.out.println("Su Cuenta fue bloqueada");
			System.out.println("__________________________");
		}
		in.close();
	}

}

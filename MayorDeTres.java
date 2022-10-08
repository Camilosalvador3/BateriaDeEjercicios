package BateriaDeEjercicio;

import java.util.Scanner;
public class MayorDeTres {
	
	  static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {

	    	 
	        int n1, n2, n3;
	        System.out.print("Introduzca primer número: ");
	        n1 = sc.nextInt();
	        System.out.print("Introduzca segundo número: ");
	        n2 = sc.nextInt();
	        System.out.print("Introduzca tercer número: ");
	        n3 = sc.nextInt();
	       
	        if (n1 > n2 && n1 > n3 )
	        {
	        	System.out.println("El Mayor Es: " + n1);
	        } 
	        else if (n2 > n1 && n2 > n3) 
	        {
	        	System.out.println("El Mayor Es: " + n2);
	        }
	        else if (n3 > n1 && n2 > n3) 
	        {
	        	System.out.println("El Mayor Es: " + n3);
	        }
	        else 
	        {
	        	System.out.println("ERROR, VUELVA A INTENTARLO");
	        	return;
	        } 
	        
	    }
	}



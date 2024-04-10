package ejercicio2;

import java.util.Scanner;

public class ArrayNombres {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
		    String[] nombres = new String[10];
    


        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre #" + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        
        }

   
        // Mostrar todos los elementos utilizando un bucle for each
        System.out.println("Elementos del array:");
        for (String n : nombres) {
            System.out.println("El nombre elegido es " + n);
        
        
       
        }
        sc.close();
}
}
package ejercicio3;

import java.util.Scanner;

public class ArrayMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float[] decimales = new float[10];
		
		   for (int i = 0; i < decimales.length; i++) {
	            System.out.print("Introduce el numero decimal #" + (i + 1) + ": ");
	            decimales[i] = sc.nextFloat();
	       }
		    float suma = 0;

	        for (float numero : decimales) {
	            suma += numero;
	        }
   

	        System.out.println("La media aritmética es: " + suma / decimales.length);
	
	       sc.close(); }
}

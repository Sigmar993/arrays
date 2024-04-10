package ejemplos;

import java.util.Scanner;

public class ArrayCuenta {
	
	   int[] array;

	    // Constructor: inicializa el array con 10 números enteros a 0
	    public ArrayCuenta() {
	        array = new int[10];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = 0;
	        }
	    }

	    // Método para solicitar al usuario que introduzca cada elemento del array
	    public void ingresarElementos() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce 10 números enteros:");

	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");

	            while (!sc.hasNextInt()) {
	                System.out.println("Error: Introduce un número entero válido.");
	                System.out.print("Elemento " + (i + 1) + ": ");
	                sc.next();
	            }

	            array[i] = sc.nextInt();
	       sc.close(); }
	    }

	    // Método que contabiliza el total de números positivos, negativos y ceros del array
	    public void contarElementos() {
	        int positivos = 0;
	        int negativos = 0;
	        int ceros = 0;

	        for (int num : array) {
	            if (num > 0) {
	                positivos++;
	            } else if (num < 0) {
	                negativos++;
	            } else {
	                ceros++;
	            }
	        }
	        System.out.println();
	        System.out.println("Resultados:");
	        System.out.println("Números positivos: " + positivos);
	        System.out.println("Números negativos: " + negativos);
	        System.out.println("Ceros: " + ceros);
	    }

	    public static void main(String[] args) {
	        // Crear una instancia de la clase
	        ArrayCuenta arrayCuenta = new ArrayCuenta();

	        // Llamar a los métodos
	        arrayCuenta.ingresarElementos();
	        arrayCuenta.contarElementos();
	    }
	   
	}

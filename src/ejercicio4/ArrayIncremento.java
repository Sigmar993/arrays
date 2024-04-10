package ejercicio4;

import java.util.Scanner;

public class ArrayIncremento {

	public static void main(String[] args) {
		

	ArrayIncremento incremento = new ArrayIncremento();
       incremento.inicializarArray();
       incremento.mostrarArray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el porcentaje de incremento: ");
        double porcentaje = sc.nextDouble();

        incremento.incrementarArray(porcentaje);
        incremento.mostrarArray();
       } 
	
    double[] numeros;

    public ArrayIncremento() {
        numeros = new double[10];
    }

    public void inicializarArray() {
        // Inicializar el array con valores de ejemplo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Puedes ajustar los valores según tus necesidades
        }
    }

    public void mostrarArray() {
    	
        System.out.println("Elementos del array:");
        for ( double numero : numeros) {
            System.out.println(numero);
        }
    }

    public void incrementarArray(double porcentaje) {
        // Incrementar cada elemento del array en el porcentaje proporcionado
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] += (numeros[i] * porcentaje / 100);
            }
        }
}
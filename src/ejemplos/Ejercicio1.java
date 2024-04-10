package ejemplos;

public class Ejercicio1 {

	public static void main(String[] args) {
		double numeros [] = {5.2,10,2.75,8.5,6,7,52.2,2};
		System.out.println("Elementos del array:");
        for ( double num : numeros) {
            System.out.println(num);
        }
		System.out.println("La media es: " + calcularMedia(numeros));
		
	}
	
private static double calcularMedia(double[] numeros) {
	double suma = 0;
	for (double num : numeros) {
		suma += num;
	}
	return suma/numeros.length;
	
}
}

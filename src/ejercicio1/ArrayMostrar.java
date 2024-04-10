package ejercicio1;

public class ArrayMostrar {

	public static void main(String[] args) {
		// Formas de poner array 
		int [] matriz = new int[10];
		matriz[0]=5;
		matriz[1]=38;
		matriz[2]=-15; 
		matriz[3]=92;
		matriz[4]=71;
		matriz[5]=67;
		matriz[6]=70;
		matriz[7]=90;
		matriz[8]=105;
		matriz[9]=-80;
		for(int i=0;i<matriz.length;i++) {
			
			System.out.println("Valor del indice " + i + " = " + matriz[i]);
			
		}
		//la otra forma de escribir un array
		int [] mi_matriz= {15,-38,115,992,1,37,904,32,70,-40};

		for(int i=0;i<matriz.length;i++) {
			
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
			
	}

	}

}

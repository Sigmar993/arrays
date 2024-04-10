package ejemplos;

public class Primero {

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
		//la otra forma de escribir un array
		int [] mi_matriz= {5,38,-15,92,71,67,70,90,105,-80};

		for(int i=0;i<matriz.length;i++) {
			
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
			
	}
		String [] nombres1= {"Paco", "Ana", "Eric", "Pedro","Andres"};
		String [] nombres = new String[5];
		nombres[0]="Paco";
		nombres[1]="Ana";
		nombres[2]="Eric"; 
		nombres[3]="Pedro";
		nombres[4]="Andres";
		
		for(int i=0;i<10;i++) {
			
			System.out.println();
			System.out.println("Valor del indice " + i + " = " + nombres1[i]);
			
	}
}
}

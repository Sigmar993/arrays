package Buscar;

public class Buscar {

	public static void main(String[] args) {
		
		int [] array = {2,5,7,8,11,19,24,30,52,76};
		int busco=52;
		
		
		
		System.out.println(buscarBinario(array,busco));
	}
	private static int buscarBinario (int[] array, int busco) {
		
		int izq, der, centro;
		izq=0;
		der=array.length-1;
		centro=(izq+der)/2;
		int itera=0;
		while (izq<der && array[centro]!=busco) {
			
			if(array[centro]>busco)
				der=centro-1;
			else
				izq=centro+1;
			
			centro=(izq+der)/2;
			itera++;
		}
		System.out.println("ITERACIONES:" + itera);
		if (array[centro]==busco) 
			return centro;
		else
			return -1;
		
		
		
	}
}

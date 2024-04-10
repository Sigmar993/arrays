package busquedas;

public class busqyedaLineal {


    public static void main(String[] args) {
        // Ejemplo de uso
        int[] Array = {1,2,3,4,5,6,7,8,9,10};
        int busco = 4;

       System.out.println(buscarLinea(Array, busco));
    }

  
    
    // Método para buscar la posición de un valor en un array con while
    private static int buscarLinea(int[] array, int busco) {
        int pos = 0;
        boolean encontrado = false;
        while (pos < array.length &&!encontrado && array[pos]<busco) {
     
            if (array[pos] == busco) {
                return pos;
            }
            pos++;
        }

        return -1;
    }
}
	// Método para buscar la posición de un valor en un array
//    private static int buscarLinea(int[] array, int busco) {
//    	
//        for (int pos = 0; pos< array.length; pos++) {
//            if (array[pos] == busco) {
//           return pos;
//            }
//        }
//      return -1;
//    }
//}
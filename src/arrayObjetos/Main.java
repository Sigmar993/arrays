package arrayObjetos;

public class Main {

	public static void main(String[] args) {
		// Crear array de empleado e inicializarlo con 4 empleados
		
		Empleado [] empleados = new Empleado[4];
		empleados[0]= new Empleado("45575359P","Juan", "Gomez" , 2000f);
		empleados[1]= new Empleado("45575358W","Erick", "Lopez" , 1500f);
		empleados[2]= new Empleado("45555462T","Pedro", "Salazar" , 1000f);
		empleados[3]= new Empleado("91555462W","Txema", "Ribote" , 3000f);
		
	
		// Recorrer el array de empleados y aumentar el salario un 5%
        for (Empleado empleado : empleados) {
            empleado.aumentoSueldo(5);
        }

        // Mostrar el nombre de cada empleado con el nuevo salario
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ": " + empleado.getSueldo()+" €");
        }
	}

}

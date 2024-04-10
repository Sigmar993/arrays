package arrayObjetos;

public class Empleado {
	
	private String dni;
	private String nombre;
	private String apellido;
	private float sueldo;
	
	public Empleado (String dni, String nombre, String apellido, float sueldo) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.sueldo=sueldo;		
	}
	public void aumentoSueldo(float porcentaje) {
		this.sueldo += this.sueldo * (porcentaje/100);		
	}
	public String getNombre() {
		return nombre;
		
	}
	public float getSueldo() {
		return sueldo;
		
	}
}

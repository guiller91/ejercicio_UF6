package ejercicioUF6_1;

public class Administrativo extends Persona {
	
	private String tareas;

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas= tareas;	
	}
	@Override
	public String toString() {
		return "Alumno  "+ super.toString() +" Curso: " + tareas;
	}
	
	public String trabajar() {
		return "El administrativo " + getNombre() + " va a realizar estas tareas: " + tareas +".";	
	}
	
	public String gestionarMatricula() {
		return "El administrativo " + getNombre() + " va a gestionar una matricula";
		
	}
	
	

}

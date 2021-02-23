package ejercicioUF6_1;

public class Alumno extends Persona{
	
	
	private String curso;

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso= curso;	
	}
	@Override
	public String toString() {
		return "Alumno  "+ super.toString() +" Curso: " + curso;
	}
	
	public String trabajar() {
		return "El alumno " + getNombre() + " va a estudiar para el curso " + curso +".";	
	}
	
	public String hacerExamen() {
		return "El alumno " + getNombre() + " va a hacer su examen";
		
	}
	

}

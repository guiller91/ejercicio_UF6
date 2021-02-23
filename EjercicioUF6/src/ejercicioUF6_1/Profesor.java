package ejercicioUF6_1;

public class Profesor extends Persona {

	private String competencias;
	
	
	
	public Profesor(String nif, String nombre, String direccion, String telefono,String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias=competencias;
	}
	
	@Override
	public String toString() {
		return "Profesor  "+ super.toString() +" Competencias: " + competencias;
	}

	public String trabajar() {
		return "El profesor " + getNombre() + " va a impartir su clase.";
	}
	
	public String ponerNotas() {
		return "El profesor " + getNombre() + " va a corregir los examenes";
	}

	
	
	

}

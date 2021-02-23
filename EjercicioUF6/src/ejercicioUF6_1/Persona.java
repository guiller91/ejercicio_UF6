package ejercicioUF6_1;

public abstract class Persona {
	

	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	
	
	//constructor
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//getter and setters
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	@Override
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	//metodos
	
	public String llamar(Persona p) {
		return this.nombre + " llamando a " + p.getNombre();
	}
	
	public abstract String trabajar();
	
	
		
	

}

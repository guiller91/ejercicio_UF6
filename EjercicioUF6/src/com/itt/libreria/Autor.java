package com.itt.libreria;

public class Autor {
	
	private String nombre;
	private String biografia;
	
	
	public Autor(String nombre, String biografia) {
		super();
		this.nombre = nombre;
		this.biografia = biografia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", biografia=" + biografia + "]";
	}

}

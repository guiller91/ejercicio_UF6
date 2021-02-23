import com.itt.libreria.*;
public class mainLibreria {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor("Guillermo","escritor independiente");
		Libro libro = new Libro("Aprende Java","Educativo",autor);
		
		
		// toString de libro
		System.out.println(libro.toString());
		
		
		// modificar biografia a partir de la clase libro	
		libro.setBiografia("Escritor consagrado");
		
		
		//invocar toString de autor de dos formas diferentes
		System.out.println("<<<<<toString>>>>>");
		System.out.println(libro.getAutor());
		System.out.println(autor.toString());
		
		//modificar genero
		libro.setGenero("Fantastico");
		System.out.println("<<<<<con genero modificado>>>>>");
		System.out.println(libro.toString());
		
		
	}
	
	

}

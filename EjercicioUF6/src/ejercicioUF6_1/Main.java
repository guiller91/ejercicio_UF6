package ejercicioUF6_1;

public class Main {
	
	public static void main(String[] args) {
		
		
		Profesor profe1 = new Profesor("71152032z", "Guillermo Perez", "C/ Parva, 4", "661156750", "matematicas y lengua");
		Alumno alumno1= new Alumno("12344567z", "Daniel Erce", "Plaza mayor, 8", "661156758", "2º Bachiller");
		Administrativo admin1= new Administrativo("12344585s", "Eva", "C/ Lagarto, 2", "612256585", "Hacer matriculas, controlar asistencia");
		//Profesor
		System.out.println(profe1.toString());
		System.out.println(profe1.trabajar());
		//Salto de linea
		System.out.println();
		//Alumno
		System.out.println(alumno1.toString());
		System.out.println(alumno1.trabajar());
		//Salto de linea
		System.out.println();
		//Administrativo
		System.out.println(admin1.toString());
		System.out.println(admin1.trabajar());
		//Salto de linea
		System.out.println();
		//Llamada de alumno a profesor
		System.out.println(alumno1.llamar(profe1));
		//Salto de linea
		System.out.println();
		//Prueba de metodos
		System.out.println(profe1.ponerNotas());
		System.out.println(alumno1.hacerExamen());
		System.out.println(admin1.gestionarMatricula());
		
	}

}

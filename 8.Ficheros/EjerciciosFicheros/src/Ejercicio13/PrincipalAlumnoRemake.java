package Ejercicio13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.*;
public class PrincipalAlumnoRemake {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
/*
 * 13. Programa que lee de teclado un fichero de texto con la información de varios
alumnos. En cada línea separada por comas, aparece el nombre, primer
apellido, nota (double) y fecha de nacimiento de cada alumno. Con los alumnos
leídos crea un ArrayList, luego lo ordena por nota de mayor a menor.
e introducir los alumnos en otro archivo (Cualquier error se manda a un archivo llamado error.log)
 */
//Formatter de fechas 
   DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
//Paso 1 Crear el ArrayList 
		ArrayList<AlumnoRemake> alumnosnuevos = new ArrayList<>();
//Paso 9 Crear un ArrayList que albergue el arraylist previo ordenado por nota de mayor a menor
		ArrayList<AlumnoRemake> alumnosordenados = new ArrayList<>();
//Paso 2 Crear el Path 
		Path p = Paths.get("Alumnos2.txt");
		Path p2 = Paths.get("AlumnosNuevos.txt");
		Path p3 = Paths.get("Error.log");
//Paso 3 Declarar los instrumentos de lectura y escritura
Charset charset = Charset.forName("UTF-8");
BufferedReader lector = null;
BufferedWriter escritor = null;
BufferedWriter escritor2 = null; //O esta bien creado en su objeto o vale null
String linea = null;
try {
	lector = Files.newBufferedReader(p,charset); //Esto puede fallar
	escritor = Files.newBufferedWriter(p2,charset,CREATE,TRUNCATE_EXISTING); //Esto puede fallar
	escritor2 = Files.newBufferedWriter(p3,charset,CREATE); //Esto puede fallar
	while((linea = lector.readLine())!= null) {
	try { //Se usa para el while por que si no el alumno que diese error pararia todos los otros alumnos
		
		//Paso 4 Crear un array de strings como resultado de la funcion split
		String informacion[] = linea.split(","); //Expresiones regulares
		//Paso 5 Coger los datos del objeto almacenandolos en variables para crear el objeto (Los arraylist usan objetos si o si)
		/*
		 *  private String nombre; 
 			private String apellido;
 			private double nota;
 			private LocalDate fecha_nacimiento
		 */
		String nombre = informacion[0];
		String apellido = informacion[1];
		double nota = Double.parseDouble(informacion[2]);
		LocalDate fecha = LocalDate.parse(informacion[3],patron);
		//Paso 6 Crear el objeto e ir añadiendolo al ArrayList
		AlumnoRemake a = new AlumnoRemake(nombre, apellido, nota, fecha);
		alumnosnuevos.add(a);
	}
	catch (DateTimeParseException e) {
		escritor2.write(linea+ " El parseo no parsea "); //Funciona como muñeca rusa en el aspecto de que el try grande se encarga de esto
		escritor2.newLine();
	}
	catch (NumberFormatException e) {
		escritor2.write(linea+ " El numero no numera ");
		escritor2.newLine();
	}
	}
	//Paso 7 Se pasa el arrayList a una funcion y que escriba en funcion dl orden
	alumnosordenados = OrdenarArrayList(alumnosnuevos);
	//Paso 9 Una vez tengamos el ArrayList lo recorremos y vamos escribiendo 
	for (AlumnoRemake aux: alumnosordenados) {
		escritor.write(aux.getNombre()+","+aux.getApellido()+","+aux.getNota()+","+aux.getFecha_nacimiento());
		escritor.newLine(); //Empieza desde una nueva linea
	}
	//Paso 10 Cerrar los instrumentos
	lector.close();
	escritor.close();
	escritor2.close();
if(Files.size(p3) == 0) { //Borrar el log si no hay errores 
	Files.deleteIfExists(p3);
	System.out.println("No hubo errores no hay log");
}
else {
	System.out.println("Se han encontrado errores");
}
System.out.println("Gracias por ejecutarme");
} 
//Paso Final catch para errores de ficheros e instrumentos
catch (NoSuchFileException e) {
	System.out.println("El fichero no existe");
}
catch (AccessDeniedException e) {
	System.out.println("No se tienen los permisos necesarios para abrir el fichero");
}
catch (IOException e) { //NO ESCRIBIR SUS ERRORES CASO CONTRARIO ES UN ROLLO PARA CONTROLAR
	System.out.println("Error general");
}
finally { //Si pasa cualquier error de entrada/Salida Cerrar los instrumentos
	if(lector != null) {
		try {
			lector.close();
		} catch (IOException e) {
			System.out.println("Error en el cerrado de lector");
		}
    if(escritor != null) {
    	try {
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error en el cerrado del escritor regular");
		}
    }
    if(escritor2 != null) {
    	try {
    		escritor2.close();
    	}
    	catch (IOException e) {
    		System.out.println("Error en el cerrado del escritor2 de errores");
    	}
    }
	}
}
	}
public static ArrayList<AlumnoRemake> OrdenarArrayList(ArrayList <AlumnoRemake> alumnosnuevos) {
	//Paso 8 método burbuja
	//El metodo de la burbuja SOLO EN ARRAYLISTS
	//PARA ORDENAR OTRAS COLECCIONES O SE USAN INTERFACES O SE CONTROLA EL PROCESO DE CREACION
	//Solo usar for normales para ARRAYLISTS O ARRAY NORMALES
	for (int i = 0; i<alumnosnuevos.size()-1;i++) { //El ultimo elemento no necesita buscar a nadie mas alla
		//Posiciones del array original (Se encarga de coger un objeto) 
		for(int j = i + 1; j<alumnosnuevos.size();j++) {
			AlumnoRemake posA = alumnosnuevos.get(i); //Obtiene el primer elemento
			AlumnoRemake posB = alumnosnuevos.get(j); //Obtiene el segundo elemento
			if(posA.getNota() < posB.getNota()) { //Si el primero es menor que el segundo entonces se intercambian la posicion
				AlumnoRemake auxiliar = posA; //En este caso particular NO SE NECESITA pero por costumbre lo hacemos
				alumnosnuevos.set(i, posB); //Modifica el primero por que es mayor por lo que va antes
				alumnosnuevos.set(j, auxiliar); //Modifica la segunda posicion para poner el menor 
			}
			//Lo de null es exclusivo para los borrados y las inserciones
		}
		//EMPIEZA EN LA SIGUIENTE POSICION DEL ARRAYLIST
	}
	return alumnosnuevos;
}
}

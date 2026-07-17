package Ejercicio17_1;

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
import java.util.HashMap;
import java.util.LinkedList;
import static java.nio.file.StandardOpenOption.*;
public class Principal17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Automóviles. Tenemos dos ficheros:
auto.info: contiene separado por comas la matrícula, fecha de compra, precio y el dni
del propietario.
Propietario.info: contiene separado por comas el dni del propietario, su nombre y
apellido.
Recorrer propietario.info y crear un hashMap con clave el DNI, en el que guardamos
todos los propietarios.
Recorrer auto.info y crear un LinkedList con los datos del auto de cada línea (si la
fecha es incorrecta, o si no existe el propietario se escribe un error en un archivo log y
se pasa a la siguiente línea).
Insertar en el linkedList los automóviles ordenados por fecha de compra de más
antigua a más reciente, y a misma fecha, ordenado de menor a mayor precio.
Volcar en un fichero (baratos.txt) todos los automóviles del LinkedList cuyo precio sea
inferior a 2000 euros, con el nombre y apellido de su propietario.
 */
/*
 * Necesitas si o si un dni doble para los propietarios y otro para los autos por que si no las propiedades se mezclan
 Y porque de todas formas los datos que sacas del fichero de autos son distintos a los que sacas de propietarios aunque no lo parezca
 */
	/*
	 * public class Propietario {
  private String dni;
  private String nombre;
  private String apellido;
	 */
	//Paso 1 declarar variables para construir y el DateTimeFormatter para posteriori
	//Propietario
	String dni_propietario;
	String nombre;
	String apellido;
	//Auto 
	String matricula;
	String dni_auto;
	double precio;
	LocalDate fecha_compra;
	//Patron
	DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
	//Paso 2 construir las colecciones 
	HashMap<String,Propietario> propietarios = new HashMap<>();
	LinkedList<Auto> autos = new LinkedList<>();
	//Paso 2.5 Poner los instrumentos de los ficheros
	Path p = Paths.get("Propietario.info");
	Path p2 = Paths.get("auto.info");
	Path p3 = Paths.get("Error.log");
	Path p4 = Paths.get("baratos.txt");
	BufferedReader primer_lector = null;
	BufferedReader segundo_lector = null;
	BufferedWriter primer_escritor = null;
	BufferedWriter segundo_escritor = null;
	String linea_propietarios;
	String linea_autos;
	Charset charset = Charset.forName("UTF-8");
	//Paso 3 Recorremos el archivo de propetarios.info y rellenamos el HashMap
	try {
	    if(Files.exists(p3)) {
	    	Files.delete(p3);
	    }
		primer_lector = Files.newBufferedReader(p,charset);
		segundo_lector = Files.newBufferedReader(p2,charset);
		primer_escritor = Files.newBufferedWriter(p3,charset,CREATE);
		segundo_escritor = Files.newBufferedWriter(p4, charset,CREATE);
	while((linea_propietarios = primer_lector.readLine()) != null) {
		String partir[] = linea_propietarios.split(",");
		dni_propietario = partir[0];
		nombre = partir[1];
		apellido = partir[2];
		Propietario pr = new Propietario(dni_propietario,nombre,apellido);
		propietarios.put(dni_propietario,pr);
	}
	//Paso 4 Recorremos el archivo de auto y en funcion de si el propietario esta en el HashMap ordenandolo de fecha mas antigua a mas reciente y en caso contrario de mas barato a mas caro
	//Generalmente la organizacion de los try catch varian en funcion de sus propositos
	while((linea_autos = segundo_lector.readLine()) != null) {
		try {
		String partir[] = linea_autos.split(",");
		matricula  = partir[0];
		dni_auto = partir[1];
		precio = Double.parseDouble(partir[2]);
		fecha_compra = LocalDate.parse(partir[3],patron);
		}
		catch (NumberFormatException e){
		primer_escritor.write(linea_autos+"El número no numera");
		primer_escritor.newLine();
		continue; //Continue es necesario caso contrario el codigo de abajo se ejecuta y no queremos eso 
		}
		catch (DateTimeParseException e) {
		primer_escritor.write(linea_autos+"El parseo no parsea");
		primer_escritor.newLine();
		continue; //Continue es necesario caso contrario el codigo de abajo se ejecuta y no queremos eso
		}
		if(!propietarios.containsKey(dni_auto)) {
			primer_escritor.write(linea_autos+"Este sujeto es un falso");
			primer_escritor.newLine();
			continue;
		}
	//Paso 5 Creamos el objeto una vez pase todo el filtro 
		Auto a = new Auto(matricula,dni_auto,precio,fecha_compra); //Este objeto es el que sera evaulado en el for
	//Paso 6 Validamos en el LinkedList las condiciones del auto para meterlo o no en el LinkedList si las cumple se mete si no se añade al final
	//Por defecto el primer elemento se va a meter en el primer hueco que tenga disponible
		
		int posicion_final = 0;
		boolean tomar_accion = false;
		for (int i = 0; i<autos.size();i++) { //Lo ideal es no cambiar el tamaño del LinkedList mientras se siga recorriendo
		Auto existencia = autos.get(i); //Paso 7 Obtenemos el objeto de la posicion para proceder a la comparacion 
		if(a.getFecha_compra().isBefore(existencia.getFecha_compra())) {
			posicion_final = i; //Se guarda la posicion
			tomar_accion = true;
			break;
		}
		//Otras formas extrañas de comparar fechas para ver si son iguales
		//compareTo
		//IsEqual
		//Equals
		else if(a.getFecha_compra().equals(existencia.getFecha_compra())) {
			if(a.getPrecio() < existencia.getPrecio()) {
				posicion_final = i;
				tomar_accion = true;
				break;
			}
		}
	}
	if(tomar_accion) {
		autos.add(posicion_final, a);
	}
	else {
		autos.addLast(a);
	}
	}
	for (Auto aux: autos) {
		if(aux.getPrecio() < 2000) {
			Propietario pr = propietarios.get(aux.getDNI());
			segundo_escritor.write(aux.getDNI()+","+aux.getMatricula()+","+aux.getPrecio()+","+aux.getFecha_compra()+","+pr.getNombre()+","+pr.getApellido()); 
			//Aqui la (redundancia de datos no importa mucho) Ya esta hecho
			segundo_escritor.newLine();
		}
	}
	primer_lector.close();
	segundo_lector.close();
	primer_escritor.close();
	segundo_escritor.close();
	}
	catch (NoSuchFileException e ) {
		System.out.println("El fichero no existe");
	}
	catch (AccessDeniedException e) {
		System.out.println("El fichero no tiene permisos");
	}
	catch (IOException e) {
		System.out.println("No tiene permisos ");
	}
	finally {
		if (primer_lector != null) {
			try {
				primer_lector.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en la lectura de Propietarios");
			}
		}
			if (segundo_lector != null) {
				try {
					segundo_lector.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error en la lectura de autos");
				}
			}
				if (primer_escritor != null) {
					try {
						primer_escritor.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("Error en la escritura del log");
					}
				}
					if (segundo_escritor != null) {
						try {
							segundo_escritor.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("Error en la escritura de baratos.txt");
						}

		}
	}
	}
}

package ejemplosfechas;

import java.time.*;

public class EjemploFechas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha de hoy:"+fechaActual); //Dia del sistema
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual:"+horaActual); //Hora del sistema
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual:"+ahora); //Dia y hora del sistema

		// Crear fechas y horas
	    //Excepcion para crear una fecha incorrecta se llama DataTimeException
		try{
		//En el try se mete codigo que puede generar excepciones
		//Si hay excepciones ejecuta lo que sigue en el catch y sigue como si nda
			LocalDate fechaNacimiento=LocalDate.of(2023, 2, 29); 
			System.out.println("Fecha nacimiento:"+fechaNacimiento); 
			
		}catch(DateTimeException e){ //La excepcion tiene como nombre E.
			System.out.println("Fecha incorrecta");
			System.out.println("Ha saltado la excepcion:"+e.getMessage());
		}
		try{
			LocalTime horaRecreo=LocalTime.of(11, 25, 0); 
			System.out.println("Salimos al recreo a las " + horaRecreo); 
		}catch(DateTimeException e){
			System.out.println("Hora incorrecta");
		}
		try{
			LocalDateTime heNacido=LocalDateTime.of(1999, 3, 28,20, 40); 
			System.out.println("Momento exacto de mi nacimiento: "+ heNacido);
		}catch(DateTimeException e){
			System.out.println("Fecha incorrecta");
		}
	}

}

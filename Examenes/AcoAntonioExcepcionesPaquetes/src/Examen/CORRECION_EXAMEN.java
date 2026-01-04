package Examen;

public class CORRECION_EXAMEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce nombre y apellido del alumno:");
		
	}
}
public static String validarAlumno(String alumno) {
	String cadena = alumno.substring(0,1);
	int pos = -1;
	do {
		pos = alumno.indexOf(' ',pos + 1);
		if (pos !=  -1)
			cadena = cadena + alumno.substring(pos +1, pos+2);
	}
	while (pos != -1);
	ret
	}
}

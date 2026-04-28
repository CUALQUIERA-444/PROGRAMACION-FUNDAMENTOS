package gimnasio;

import java.time.LocalDate;

public class Preferente extends Socio {

	private static int numPref;

	public Preferente(String nombre, String apellidos, String telefono, LocalDate fechanac) {
		super(nombre, apellidos, telefono, fechanac);
		numPref++;
		codigo="P"+numPref;
		// TODO Auto-generated constructor stub
	}

	public double cobrar() {
		double importe=10+vecesMes*2;
		vecesMes=0;
		return importe;
	}
}

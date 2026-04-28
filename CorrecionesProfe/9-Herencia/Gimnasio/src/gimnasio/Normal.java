package gimnasio;

import java.time.LocalDate;

public class Normal extends Socio {
	private static int numNormal;
	private double importeTotal;

	public Normal(String nombre, String apellidos, String telefono, LocalDate fechanac) {
		super(nombre, apellidos, telefono, fechanac);
		// TODO Auto-generated constructor stub
		numNormal++;
		codigo="N"+ numNormal;
	}
	public long salir() {
		long tpo=super.salir();
		if (tpo<30)
			importeTotal+=6;
		else
			if (tpo<60)
				importeTotal+=9;
			else
				importeTotal+=12;
		return tpo;
	}
	
	public double cobrar() {
		double importe= importeTotal;
		vecesMes=0;
		importeTotal=0;
		return importe;
	}

}

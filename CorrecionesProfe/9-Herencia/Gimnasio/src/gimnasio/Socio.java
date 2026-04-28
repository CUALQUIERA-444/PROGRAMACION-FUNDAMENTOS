package gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class Socio {
	private String nombre,apellidos,telefono;
	protected String codigo;
	private LocalDate fechanac;
	private LocalTime horaEnt;
	private int vecesGym, tpoTotal;
	protected int vecesMes;
	public Socio(String nombre, String apellidos, String telefono, LocalDate fechanac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechanac = fechanac;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public boolean entrar() {
		if (horaEnt!=null)
			return false;
		horaEnt=LocalTime.now();
		vecesGym++;
		vecesMes++;
		return true;
	}
	
	public long salir() {
		long segundos;
		if (horaEnt==null)
			return 0;
		segundos=ChronoUnit.SECONDS.between(horaEnt, LocalTime.now());
		tpoTotal+=segundos;
		return segundos;
		
	}
	
	public abstract double cobrar();
	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", codigo=" + codigo
				+ ", fechanac=" + fechanac + ", horaEnt=" + horaEnt + ", vecesGym=" + vecesGym + ", tpoTotal="
				+ tpoTotal + "]";
	}
	
	
	
	
}

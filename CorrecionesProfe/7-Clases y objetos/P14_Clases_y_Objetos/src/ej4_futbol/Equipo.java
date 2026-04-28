package ej4_futbol;

public class Equipo {
	private String nombre;
	private int puntos,golesF,golesC,partidosG,partidosP,partidosE;

	public Equipo(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	// Faltan dos casos, codificarlos
	public static void anotarPartido(Equipo e1,Equipo e2,int gol1,int gol2) {
		if (gol1>gol2) {
			e1.partidosG++;
			e2.partidosP++;
			e1.puntos+=3;
			e1.golesF+=gol1;
			e1.golesC+=gol2;
			e2.golesF+=gol2;
			e2.golesC+=gol1;
		}
		else if (gol2>gol1) {
			
		}
		else {
			
		}
	}

	public void anotarPartido(int gol1,int gol2) {
		if (gol1>gol2) {
			this.partidosG++;
			
			this.puntos+=3;
			this.golesF+=gol1;
			this.golesC+=gol2;
			
		}
		else if (gol2>gol1) {
			
		}
		else {
			
		}
	}
}

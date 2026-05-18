package Ejercicio13_1;
//NOTAS 

//EL MERIDIANO Son las líneas verticales (paradas). Te dicen si 
//satelite está más al Norte o más al sur (Van de -90º a 90)
//EL PARALELO (Latitud): Son las líneas horizontales (acostadas).
//Te dicen si el satélite está más al Norte o más al SUR.
//Esencialmente junto a la distancia de la tierra se encargan 
//De ver donde esta exactamente dónde está el trozo de metal sobre la tierra
public class Satélite {
	private double meridiano; 
	private double distancia;
	private double paralelo;
	public Satélite(double meridiano, double distancia,double paralelo) {
		this.meridiano = meridiano;
		this.distancia = distancia;
		this.paralelo = paralelo;
	}
	public boolean EstaEnOrbita() { //Unico para cada satelite
		if(distancia < 0) 
		return false;
		else {
		return true;
		}
	}
	public void ModificarAlturaDeUnSatelite(double distancipe) {
		distancia = distancipe; //Cambia el valor mediante el uso de la función
	}
	public void ModificarPosicion(double nuevom,double nuevop) {
		meridiano = nuevom;
		paralelo = nuevop;
	}
	@Override
	public String toString() {
		return "Satélite [meridiano=" + meridiano + ", distancia=" + distancia + ", paralelo=" + paralelo + "]";
	}
	
}

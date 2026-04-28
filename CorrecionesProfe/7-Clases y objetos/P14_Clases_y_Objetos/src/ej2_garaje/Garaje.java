package ej2_garaje;

public class Garaje {
	private int id, planta;
	private double metros,precio;
	private boolean alquilado;
	private static double beneficios;
	
	public Garaje(int id, int planta, double metros) {
		super();
		this.id = id;
		this.planta = planta;
		this.metros = metros;
		this.alquilado = false;
		precio = 18;
		if (planta==1)
			precio+=3;
		else
			if (planta==2)
				precio+=1.5;
			else
				precio+=1;
		if (metros>4)
			precio+=1.5;
		if (metros<3)
			precio-=1;
		
		
	}

	public int getId() {
		return id;
	}

	public boolean alquilar() {
		if (alquilado==true)
			return false;
		alquilado=true;
		beneficios+=precio*12;
		return true;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	@Override
	public String toString() {
		return "Garaje [id=" + id + ", planta=" + planta + ", metros=" + metros + ", precio=" + precio + ", alquilado="
				+ alquilado + "]";
	}
	
	public double subirPrecio(double porcentaje) {
		if (alquilado==false) {
			precio=precio+precio*porcentaje/100;
			return precio;
		}
		
		return -1;
	}

	public static double getBeneficios() {
		return beneficios;
	}

	
	
	
	

}

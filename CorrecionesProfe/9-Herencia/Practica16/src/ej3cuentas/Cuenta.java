package ej3cuentas;

import java.util.ArrayList;

public class Cuenta {
	private double saldo;
	protected double interes;
	private ArrayList<String> titulares;
	private int numero;
	private static int totalCtas=0;
	
	public Cuenta(double saldo, ArrayList<String> titulares) {
		//super();
		this.saldo = saldo;
		this.titulares = titulares;
		totalCtas++;
		interes=3;
		numero=totalCtas;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", interes=" + interes + ", titulares=" + titulares + ", numero=" + numero
				+ "]";
	}
	
	public boolean estaTitular(String tit) {
		for(int i=0;i<titulares.size();i++)
			if (titulares.get(i).equalsIgnoreCase(tit))
				return true;
		
		return false;

		/*if (titulares.contains(tit))
				return true;
		
		return false;
		*/
	}
	
	public double beneficios(int dias) {
		return (dias*saldo*interes)/365;
	}

	public int getNumero() {
		return numero;
	}

	
	
	

}

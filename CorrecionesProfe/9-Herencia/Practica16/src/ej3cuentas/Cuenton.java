package ej3cuentas;

import java.util.ArrayList;
import java.util.Random;

public class Cuenton extends Cuenta {
	private static final double limite=600;
	private static int TotalCuentones=0;

	public Cuenton(double saldo, ArrayList<String> titulares) throws LimiteInsuficienteException {
		super(saldo, titulares);
		// TODO Auto-generated constructor stub
		if (saldo<limite)
			throw new LimiteInsuficienteException("Insuficiente saldo");
		interes=4;
		TotalCuentones++;
	}

	@Override
	public String toString() {
		return "Cuenton " + super.toString() ;
	}

	public static double getLimite() {
		return limite;
	}
	
	public static void borrar() {
		TotalCuentones--;
	}
	
	public static int sorteo() {
		if (TotalCuentones==0)
			return -1;
		Random r=new Random();
		return r.nextInt(TotalCuentones);
	}

	

}

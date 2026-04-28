package practica1;

public class Ejercicio6 {
	public static void main(String[] args) {
	int edad=20, nivelEstudios=4;
	double salario=30000;
	boolean jasp;
	
	jasp= (edad<28) && (nivelEstudios>3) && (salario>28000);
	System.out.println("El trabajador es jasp?:" + jasp);
	}
}

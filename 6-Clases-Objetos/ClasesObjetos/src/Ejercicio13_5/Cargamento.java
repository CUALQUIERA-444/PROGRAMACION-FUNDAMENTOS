package Ejercicio13_5;

// import Ejercicio13_6.AlumnoMejorado; Importar de otros paquetes
/*
 * 5. En un almacén se guarda fruta para su posterior venta. Por cada cargamento se
tiene la siguiente información: nombre de la fruta, procedencia, número de kilos,
precio coste por kilo y precio venta por kilo.
Codificar una clase para manejar esta información de forma que contenga las
siguientes operaciones:
- Constructor
- Método que devuelva la información de cada cargamento de fruta.
- Método “rebajar” que rebaja el precio de venta en una cantidad pasada
como parámetro, (el precio de venta nunca puede ser menor que el precio
de coste).
- Método “vender”: se le pasa el número de kilos a vender y si hay suficiente
cantidad, se decrementa el número de kilos y se devuelve el importe de la
venta, sino da error.
- Método que nos diga si dos cargamentos de fruta tienen la misma
procedencia.
- Llevar en todo momento el beneficio obtenido por el almacén.
*/
public class Cargamento {
	private String nombreF;
	private String procedencia;
	private int n_Kilos;
	private double pc_Kilo;
	private static double beneficio_general;
	private double pv_Kilo;
public Cargamento(String nombreF,String procedencia,int n_Kilos,double pc_Kilo, double pv_Kilo) {
	this.nombreF = nombreF;
	this.procedencia = procedencia;
	this.n_Kilos = n_Kilos;
	this.pc_Kilo = pc_Kilo;
	this.pv_Kilo = pv_Kilo;
}
public Cargamento() {
}
@Override
public String toString() {
	return "Cargamento [nombreF=" + nombreF + ", procedencia=" + procedencia + ", n_Kilos=" + n_Kilos + ", pc_Kilo="
			+ pc_Kilo + ", pv_Kilo=" + pv_Kilo + "]";
}
public void Rebajar(double cantidad_rebaja) {
	if(pv_Kilo - cantidad_rebaja < pc_Kilo) {
		System.out.println("No se puede rebajar");
	}
	else {
		pv_Kilo -= cantidad_rebaja;
		//Cada objeta pasa por aca el valor es distinto
	}
}
public double Vender(int n_KilosVenta) throws ErrorVentaException{
	if(n_Kilos < n_KilosVenta) {
		throw new ErrorVentaException("No se ha podido realizar la venta");
	}
	else  {
		double importe = n_KilosVenta * pv_Kilo;
		beneficio_general += importe - (pc_Kilo * n_KilosVenta);
		n_Kilos -= n_KilosVenta;
		return importe;
	}
}
public boolean Comparar(Cargamento c2) {
	if(procedencia.equalsIgnoreCase(c2.procedencia)) { //Se usa para comparar los Strings
		//Daba bien antes por el String pool (Codigo escrito a mano)
	return true;	
	}
	else {
	return false;	
	}
}
public static double getBeneficio_general() {
	return beneficio_general;
}

}

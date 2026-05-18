package Ejercicio14_3;
import Ejercicio13_5.ErrorVentaException;

public class CargamentoMejorado {
	private String nombreF;
	private String procedencia;
	private int n_Kilos;
	private double pc_Kilo;
	private static double beneficio_general;
	private double pv_Kilo;
public CargamentoMejorado(String nombreF,String procedencia,int n_Kilos,double pc_Kilo, double pv_Kilo) {
	this.nombreF = nombreF;
	this.procedencia = procedencia;
	this.n_Kilos = n_Kilos;
	this.pc_Kilo = pc_Kilo;
	this.pv_Kilo = pv_Kilo;
}
public CargamentoMejorado() {
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
		System.out.println("Rebaja hecha con exito");
		//Cada objeta pasa por aca el valor es distinto
	}
}
public double Vender(int n_KilosVenta){
	if(n_Kilos < n_KilosVenta) {
		//throw new ErrorVentaException("No se ha podido realizar la venta"); Mala idea de diseño para la version mejorada si no estaria paralizando el programa 
		//Cada vez que se produzca
		return 0; 
	}
	else  {
		double importe = n_KilosVenta * pv_Kilo;
		beneficio_general += importe - (pc_Kilo * n_KilosVenta);
		n_Kilos -= n_KilosVenta;
		return importe;
	}
}
public boolean Comparar(CargamentoMejorado c2) {
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
public String getNombreF() {
	return nombreF;
}
public int getN_Kilos() {
	return n_Kilos;
}

}

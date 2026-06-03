package Ejercicio15_2;
/*Dar de alta un cargamento, sólo si hay espacio suficiente en el array.
	Se preguntará al principio del programa el tamaño del array (por
	teclado) (Debate con el usuario)
	- Mostrar toda la información de todos los cargamentos. 1
	- Rebajar un cargamento. Se pide por teclado el nombre de la fruta, la
	procedencia y la rebaja a efectuar, se busca en el array y si existe se
	le aplica la rebaja. 2
	- Vender. Se pide por teclado el nombre de la fruta y se busca el
	primer cargamento de esa fruta que haya, si hay suficientes
	unidades se realiza la venta, sino se busca el siguiente cargamento
	con dicho nombre de fruta. 3
	- Mostrar el beneficio obtenido por el almacén. 4
	- Borrar todos los cargamentos que tengan 0 kilos. 5
	*/
public class CargamentoSupremo {
		private String nombreF;
		private String procedencia;
		private int n_Kilos;
		private double pc_Kilo;
		private static double beneficio_general;
		private double pv_Kilo;
	public CargamentoSupremo(String nombreF,String procedencia,int n_Kilos,double pc_Kilo, double pv_Kilo) {
		this.nombreF = nombreF;
		this.procedencia = procedencia;
		this.n_Kilos = n_Kilos;
		this.pc_Kilo = pc_Kilo;
		this.pv_Kilo = pv_Kilo;
	}
	public CargamentoSupremo() {
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
	public boolean Comparar(CargamentoSupremo c2) {
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

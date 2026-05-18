package Ejercicio13_5;

public class PrincipalFruta {
	/*Para probar dicha clase hacer un main que:
		- Dé de alta 3 cargamentos y muestre su información.
		- Diga si los dos primeros tienen la misma procedencia.
		- Rebaje el precio del tercero.
		- Realice ventas de los tres cargamentos.
		- Muestre el beneficio obtenido por el almacén.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cargamento c1 = new Cargamento ("Platano","Bolivia",9,3,6);
	Cargamento c2 = new Cargamento ("Naranja","Bolivia",13,3.5,4.4);
	Cargamento c3 = new Cargamento ("Kiwi","Amazonas",8,1,4);																														
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	System.out.println(c3.toString());
	if(c1.Comparar(c2))
		System.out.println("Tienen la misma procedencia");
	else 
		System.out.println("No tienen la misma procedencia");
	c3.Rebajar(100);
	c3.Rebajar(1);
	try {
	System.out.println("Importe "+c1.Vender(10));
	/*System.out.println(c1.Vender(8));
	System.out.println(c2.Vender(14));
	System.out.println(c2.Vender(12));
	System.out.println(c3.Vender(9));
	System.out.println(c3.Vender(7));
	*/
	}
	catch (ErrorVentaException e){
		System.out.println(e.getMessage());
	}
	try {
		System.out.println("Importe "+c2.Vender(14));
	}
	catch (ErrorVentaException e){
		System.out.println(e.getMessage());
	}
	try {
		System.out.println("Importe "+c3.Vender(1));
	}
	catch (ErrorVentaException e){
		System.out.println(e.getMessage());
	}
	System.out.println("Beneficio total "+Cargamento.getBeneficio_general());
	}
}

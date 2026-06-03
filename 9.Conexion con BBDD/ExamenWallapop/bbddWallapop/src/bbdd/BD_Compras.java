package bbdd;

import java.sql.ResultSet;
import java.sql.Statement;

public class BD_Compras extends BD_Conector {
	private static Statement s; //Lleva la orden de Java hacia mysql
	private static ResultSet reg; //Filas que devuelve la consulta GENERALMENTE GESTIONA LOS SELECTS

	public BD_Compras(String bbdd) {
		super(bbdd);
	}
}

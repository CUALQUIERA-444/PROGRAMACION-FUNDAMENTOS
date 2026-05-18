package bbdd;
import java.sql.*;
	public class BD_Compras extends BD_Conector{
		//Clase herededa del conecta que especifica la base de datos a la que se acceder 
			private static Statement s;	/* Se usa en todas las instrucciones que vaya a ejecutar en la BBDD */
			private static ResultSet reg;  /* sólo en los select */
			
			public BD_Tarjetas(String file){
				super(file);
			}
			
		//Gestiona las acciones realizadas en la BBDD	
}

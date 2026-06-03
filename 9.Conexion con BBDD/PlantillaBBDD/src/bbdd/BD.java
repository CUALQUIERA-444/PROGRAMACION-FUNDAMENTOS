package bbdd;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import clases.*;
import main.*;
import java.time.*;

public class BD extends BD_Conector {

	private static Statement s;
	private static ResultSet reg;

	public BD(String file) {
		super(file);
	}

	public ArrayList<Cuenta> MostrarInformacion(String dni) throws ErrorBaseDatos {
		String consulta = "SELECT * FROM `cuentas` WHERE titular1 = '" + dni + "' OR titular2 = '" + dni
				+ "' OR titular3 = '" + dni + "'";
		// int numero, String titular1, String titular2, String titular3,
		// double saldo, LocalDate fecha
		ArrayList<Cuenta> cuentasinfo = new ArrayList<>();
		try {
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(consulta);
			while (reg.next()) {
				cuentasinfo.add(new Cuenta(reg.getInt("número"), reg.getString("titular1"), reg.getString("titular2"),
						reg.getString("titular3"), reg.getDouble("saldo"), reg.getDate("fecha").toLocalDate()));
			}
			s.close();
			this.cerrar();
			return cuentasinfo;
		} catch (SQLException e) {
			this.cerrar();
			throw new ErrorBaseDatos("No devuelve informacion");
		}
	}

	public int añadir_Tarjeta(Tarjeta tar) throws ErrorBaseDatos {

		String cadenaSQL = "INSERT INTO tarjetas VALUES (" + tar.getNumero() + "," + tar.getCuenta() + ",'"

				+ tar.getTitular() + "'," + tar.getLimite() + ",'" + tar.getTipo() + "','" + tar.getCaducidad() + "','"

				+ tar.getClave() + "'," + tar.getBloqueada() + ")";

		try {

			this.abrir();

			s = c.createStatement();

			int filas = s.executeUpdate(cadenaSQL);

			s.close();

			this.cerrar();

			return filas;

		} catch (SQLException e) {

			this.cerrar();

			throw new ErrorBaseDatos("No se puede realizar el alta de la tarjeta");

		}

	}
}

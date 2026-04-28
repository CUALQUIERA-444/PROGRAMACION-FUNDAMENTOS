
/*
 * BD_Agenda: Operaciones de inserci�n, borrado y b�squeda en la tabla contactos
 */
package bbdd;

import java.sql.*;
import java.util.*;

import modelos.Contacto;

public class BD_Agenda extends BD_Conector {
	private static Statement s;
	private static ResultSet reg;

	public BD_Agenda(String bbdd) {
		super(bbdd);
	}

	public boolean añadir(Contacto ct) {
		String cadena = "INSERT INTO contactos VALUES('" + ct.getNombre() + "','" + ct.getApellidos() + "','"
				+ ct.getTelefono() + "')";

		try {
			this.abrir();
			s = c.createStatement();
			s.executeUpdate(cadena);
			s.close();
			this.cerrar();
			return true;
		} catch (SQLException e) {
			this.cerrar();
			return false;
		}

	}

	public boolean añadir(String nombre, String apellidos, String telefono) {
		String cadena = "INSERT INTO contactos VALUES('" + nombre + "','" + apellidos + "','" + telefono + "')";

		try {
			this.abrir();
			s = c.createStatement();
			s.executeUpdate(cadena);
			s.close();
			this.cerrar();
			return true;
		} catch (SQLException e) {
			this.cerrar();
			return false;
		}

	}

	public int borrar(String tel) {
		String cadena = "DELETE FROM contactos WHERE telefono='" + tel + "'";

		try {
			this.abrir();
			s = c.createStatement();
			int filas = s.executeUpdate(cadena);
			s.close();
			this.cerrar();
			return filas;

		} catch (SQLException e) {
			this.cerrar();
			return -1;
		}
	}

	public int modificar(Contacto ct) {
		String cadena = "UPDATE contactos set nombre='" + ct.getNombre() + "',apellidos='" + ct.getApellidos()
				+ "'  WHERE telefono='" + ct.getTelefono() + "'";

		try {
			this.abrir();
			s = c.createStatement();
			int filas = s.executeUpdate(cadena);
			s.close();
			this.cerrar();
			return filas;

		} catch (SQLException e) {
			this.cerrar();
			return -1;
		}
	}

	/**
	 * Busca en contactos el teléfono dado el nombre y apellido de un contacto.
	 * 
	 * @param ct
	 * @return El teléfono si lo encuentra, una cadena vacía si no lo encuentra, y
	 *         null si ha habido un problema en el código
	 */

	public String buscarTelefono(Contacto ct) {
		String cadena = "SELECT telefono FROM contactos WHERE nombre='" + ct.getNombre() + "' AND apellidos='"
				+ ct.getApellidos() + "'";
		try {
			String t = "";
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadena);
			if (reg.next()) {
				// t = reg.getString(1);
				t = reg.getString("telefono");

			}

			s.close();
			this.cerrar();
			return t;
		} catch (SQLException e) {

			return null;

		}

	}

	/**
	 * Dado el teléfono busca en contactos el nombre y apellido de ese contacto.
	 * 
	 * @param String tel
	 * @return El nombre y el apellido si encuentra el teléfono, una cadena vacía si
	 *         no lo encuentra, y null si ha habido un problema en el código
	 */

	public String buscarTelefono2(String tel) {
		String cadena = "SELECT nombre,apellidos FROM contactos WHERE telefono='" + tel + "'";
		try {
			String t = "";
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadena);
			if (reg.next()) {
				// t = reg.getString(1) + " " + reg.getString(2);
				t = reg.getString("nombre") + " " + reg.getString("apellidos");

			}

			s.close();
			this.cerrar();
			return t;
		} catch (SQLException e) {

			return null;

		}

	}

	public Contacto buscarTelefono3(String tel) throws SQLException {
		Contacto con = null;
		String cadena = "SELECT nombre,apellidos FROM contactos WHERE telefono='" + tel + "'";

		this.abrir();
		s = c.createStatement();
		reg = s.executeQuery(cadena);
		if (reg.next()) {
			// t = reg.getString(1) + " " + reg.getString(2);
			// t=reg.getString("nombre")+ " " + reg.getString("apellidos");
			con = new Contacto(reg.getString("nombre"), reg.getString("apellidos"), tel);

		}

		s.close();
		this.cerrar();
		return con;

	}

	public ArrayList<Contacto> mostrarContactos() {
		ArrayList<Contacto> v = new ArrayList<Contacto>();
		String cadena = "SELECT * FROM contactos ";
		try {

			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadena);
			while (reg.next()) {
				v.add(new Contacto(reg.getString("nombre"), reg.getString("apellidos"), reg.getString("telefono")));
			}

			s.close();
			this.cerrar();
			return v;
		} catch (SQLException e) {

			return null;

		}

	}

}

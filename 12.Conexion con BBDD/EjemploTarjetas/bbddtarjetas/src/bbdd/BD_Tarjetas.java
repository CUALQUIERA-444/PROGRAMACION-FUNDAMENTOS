package bbdd;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

import modelos.Movimiento;

import java.time.*;

import tarjetas.*;

public class BD_Tarjetas extends BD_Conector{
//Clase herededa del conecta que especifica la base de datos a la que se acceder 
	private static Statement s;	/* Se usa en todas las instrucciones que vaya a ejecutar en la BBDD */
	private static ResultSet reg;  /* sólo en los select */
	
	public BD_Tarjetas(String file){
		super(file);
	}
	
//Gestiona las acciones realizadas en la BBDD	
	public  int añadir_Movimiento( Movimiento m) throws ErrorBaseDatos{	//añadir Movimientos
		String cadenaSQL="INSERT INTO movimientos (tarjeta,cargado,importe,fecha) VALUES ("+ m.getNumtarjeta()+","+
	                      m.isCargado()+","+m.getImporte()+",'"+m.getFecha()+"')";
		
		try{
			this.abrir();
			s=c.createStatement();
			int filas=s.executeUpdate(cadenaSQL);
			s.close();
			this.cerrar();
			return filas;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("No se puede realizar el alta movimiento");
		}
	}
	
	/*
	public  int añadir_Alumno( Alumno al) throws ErrorBaseDatos{	
		String cadenaSQL="INSERT INTO alumnos VALUES('" + al.getNombre() + "','" +
		al.getDni()+"','"+ al.getTelenono() +"',"+ al.getMatricula()+",'"+
				al.getCurso()+"','"+al.getFechaMatricula()+"')"; 	
		
		try{
			this.abrir();
			s=c.createStatement();
			int filas=s.executeUpdate(cadenaSQL);
			s.close();
			this.cerrar();
			return filas;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("No se puede realizar el alta");
		}
	}
	
	
	public  int añadir_Curso( Curso cur) throws ErrorBaseDatos{	
		String cadenaSQL="INSERT INTO cursos VALUES('" + cur.getCurso() + "','" + cur.getDescripcion()+"','"+cur.getAula()+"')";
		
		try{
			this.abrir();
			s=c.createStatement();
			int filas=s.executeUpdate(cadenaSQL); //Me va a devolver 0 ó 1
			s.close();
			this.cerrar();
			return filas;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("No se puede realizar el alta");
		}
	}
	
	public int borrar_Alumno(String dni) throws ErrorBaseDatos{
		String cadenaSQL="DELETE from alumnos where dni='"+dni+"'";
		try{
			this.abrir();
			s=c.createStatement();
			int filas=s.executeUpdate(cadenaSQL); //Me va a devolver 0 ó 1
			s.close();
			this.cerrar();
			return filas;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("No se puede realizar el alta");
		}
	}
	
	
	public Alumno buscar_Alumno(String dni) throws ErrorBaseDatos{
		String cadenaSQL="SELECT * from alumnos WHERE dni='"+dni+"'";
		Alumno al=null;
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			if ( reg.next()){
				// La fecha que se extrae de la bbdd es sql.Date, hay que transformarla a LocalDate
				//java.sql.Date f=reg.getDate("fechaMatricula");
				//LocalDate fBuena=f.toLocalDate();
				//listaCursos.add(new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),fBuena));
				al=new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),reg.getDate("fechaMatricula").toLocalDate());
				
			}
			s.close();
			this.cerrar();
			return al;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("Listando alumnos curso");	
		}
		
	}
	
	
	public ArrayList<Alumno> buscar_Alumno_Mat(int mat) throws ErrorBaseDatos{
		String cadenaSQL="SELECT * from alumnos WHERE matricula >"+ mat;
		ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				// La fecha que se extrae de la bbdd es sql.Date, hay que transformarla a LocalDate
				//java.sql.Date f=reg.getDate("fechaMatricula");
				//LocalDate fBuena=f.toLocalDate();
				//listaCursos.add(new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),fBuena));
				alumnos.add(new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),reg.getDate("fechaMatricula").toLocalDate()));
				
			}
			s.close();
			this.cerrar();
			return alumnos;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("Listando alumnos por matrícula superior");	
		}
		
	}
	
	public  ArrayList<Alumno> listadoAlumnosCurso(String curso) throws ErrorBaseDatos{
		String cadenaSQL="SELECT * from alumnos WHERE curso='"+curso+"'";
		ArrayList<Alumno> listaCursos=new ArrayList<Alumno>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				// La fecha que se extrae de la bbdd es sql.Date, hay que transformarla a LocalDate
				//java.sql.Date f=reg.getDate("fechaMatricula");
				//LocalDate fBuena=f.toLocalDate();
				//listaCursos.add(new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),fBuena));
				listaCursos.add(new Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),reg.getInt("matricula"),reg.getString("telefono"),reg.getDate("fechaMatricula").toLocalDate()));
				
			}
			s.close();
			this.cerrar();
			return listaCursos;
		}
		catch ( SQLException e){	
			this.cerrar();
			throw new ErrorBaseDatos("Listando alumnos curso");	
		}
	}
	
	
	public  Vector<String> listadoCursos() throws ErrorBaseDatos{
		String cadenaSQL="SELECT curso from cursos";
		Vector<String> listaCursos=new Vector<String>();
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				listaCursos.add(reg.getString(1));
			}			
			s.close();
			this.cerrar();
			return listaCursos;
		}
		catch ( SQLException e){
		//	System.out.println(e.getMessage());
		
			this.cerrar();
			throw new ErrorBaseDatos("Listando cursos");
			
		}
	}
	
	public  void listadoAlumnosPorCurso() throws ErrorBaseDatos{
		String cadenaSQL="SELECT curso from cursos";
	    String curso="";
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				curso=reg.getString(1);
				System.out.println("CURSO:"+curso);
				Statement s2=c.createStatement();
				ResultSet reg2=s2.executeQuery("select nombre from alumnos where curso='"+curso+"'");
				while ( reg2.next()){
					System.out.println("\t"+reg2.getString(1));
				}			
				s2.close();
			}			
			s.close();
			this.cerrar();
			return;
		}
		catch ( SQLException e){
		//	System.out.println(e.getMessage());
			this.cerrar();
			throw new ErrorBaseDatos("Listando cursos");
			
		}
	}
	*/
	
}

package gimnasio;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	public static void main(String st[]) {
		int opc;
		LocalDate fechaN=null;
		String tel,tipo,codigo;
		ArrayList<Socio> socios = new ArrayList<Socio>();
		HashSet<String> tipos = new HashSet<String>();
		tipos.add("normal");
		tipos.add("preferente");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Alta socio.\n2.Entrar\n3.Salir socio\n4.Informaci�n\n5.Cobrar\n6.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Anote nombre:");
				String nombre = sc.nextLine();
				System.out.println("Anota apellido:");
				String apellido = sc.nextLine();

				try {
					buscarSocio(socios, nombre, apellido);
					boolean correcto = false;
					do {
						System.out.println("Introduce la fecha de nacimiento (aaaa-mm-dd):");
						String fechaS = sc.nextLine();
						try {
							fechaN = LocalDate.parse(fechaS);
							correcto = true;
						} catch (DateTimeParseException e) {
							System.out.println("Fecha incorrecta");
						}
					} while (!correcto);
					
					do {
						System.out.println("Introduce tel�fono:");
						tel = sc.nextLine();
					} while (!tel.matches("[0-9]{9}"));
					do {
						System.out.println("Tipo de usuario:(normal/preferente)");
						tipo = sc.nextLine();
					} while (!tipos.contains(apellido.toLowerCase()));
					
					if (tipo.equalsIgnoreCase("normal"))
						socios.add(new Normal(nombre,apellido,tel,fechaN));
					else
						socios.add(new Preferente(nombre,apellido,tel,fechaN));
							

				} catch (YaExisteException e) {
					// TODO Auto-generated catch block
					System.out.println("Ya existe el usuario");
				}
				break;
			case 2:
				System.out.println("Anota codigo:");
				codigo=sc.nextLine();
				boolean encontrado=false;
				for(Socio s:socios) {
				//for(int i=0;i<socios.size();i++){
					//socios.get(i).getCodigo().equals(codigo)
					if (s.getCodigo().equals(codigo)) {
						if (s.entrar())
							System.out.println("Ha entrado con éxito");
						else
							System.out.println("Ya estaba dentro");
						encontrado=true;
						break;
					}
				}
				if (!encontrado)
					System.out.println("No existe el socio");
				
				break;
			case 3:
				System.out.println("Anota codigo:");
				codigo=sc.nextLine();
				Socio s=buscarPosSocio(socios,codigo);
				if (s==null)
					System.out.println("No existe ese socio");
				else
					if (s.salir()==0)
						System.out.println("El socio no estaba dentro");
				break;
				
				
			case 4:
				
			}

	}while(opc!=6);

	}

	public static void buscarSocio(ArrayList<Socio> socios, String nombre, String apellido) throws YaExisteException {
		for (Socio s : socios) {
			if (s.getNombre().equalsIgnoreCase(nombre) && s.getApellidos().equalsIgnoreCase(apellido))
				throw new YaExisteException("Ya existe ese usuario");
		}
	}

	public static Socio buscarPosSocio(ArrayList<Socio> socios, String codigo) {
		for (Socio s : socios) {
			if (s.getCodigo().equalsIgnoreCase(codigo))
				return s;
		}
		return null;
	}

}

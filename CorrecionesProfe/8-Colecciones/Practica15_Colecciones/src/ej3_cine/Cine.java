package ej3_cine;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Cine {
	private LinkedList<Usuario> cola;
	private int aforo, vendidas;
	public Cine(int aforo) {
		super();
		this.aforo = aforo;
		cola=new LinkedList<Usuario>();
	}
	
	public void llegarCola(String n, int num) {
		Usuario us=new Usuario(n,num);
		//System.out.println("El número hash es:"+us.hashCode());
		cola.add(us);
	}

	public void comprarEntradas() throws AforoCompletoException {
		try {
			Usuario us = cola.removeFirst();
			int ent = us.getnEntradas();
			if (ent<=aforo-vendidas) {
				System.out.println("Compra realizada correctamente");
				vendidas+=ent;
				if (vendidas==aforo) {
					System.out.println("Se han agotado las entradas");
					cola.clear();
					//opc=5;
				}
			} else {
				throw new AforoCompletoException("Aforo completo");
			}

		} catch (NoSuchElementException e) {
			System.out.println("No hay nadie en la cola");
		}
	}
	
	public void dejarCola() {
		if (cola.size() != 0) {
			Random r = new Random();
			int pos = r.nextInt(cola.size());
			Usuario us = cola.remove(pos);
			System.out.println(us.getNombre()+" ha salido de la cola");
		} else
			System.out.println("La cola está vacía");
	}

	@Override
	public String toString() {
		return "Cine [cola=" + cola + ", aforo=" + aforo + ", vendidas=" + vendidas + "]";
	}
	
	
	
}

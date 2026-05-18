package Ejercicio13_2;
public class Etiqueta {
	private int anchura;
	private int altura;
	private char caracter;
	public Etiqueta(int anchura, int altura, char caracter) {
		this.anchura = anchura;
		this.altura = altura;
		this.caracter = caracter;
	}
	public void ModificarCaracter(char c) {
		this.caracter = c;
	}
	public void MostrarEtiqueta() {
	    for (int i = 0;i<altura;i++) {
	    	for(int j=0;j<anchura;j++) {
	    		if(altura % 2 != 0) { //SOLO SI LA ETIQUETA TIENE UNA ALTURA IMPAR
	    			if(j == 0 || j==(anchura-1) ||i % 2 == 0)  { //Imprime si j es 0 o el ultimo o si la fila en la que esta es par
	    				System.out.print(caracter);
	    		}
	    			else {
	    				System.out.print(" ");
	    			}
	    	}
	    		else {
	    			System.out.print(caracter);
	    		}
	    }
	    	System.out.println(); //Impide un salto de linea raro al comienzo del bucle (Antes de imprimir los numeros)
	}
	}
}



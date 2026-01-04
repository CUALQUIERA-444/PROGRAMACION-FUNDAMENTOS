package Soluciones_TODO;
/**
 * Detecta si las aserciones est�n activadas
 * @author begol
 *
 */

public class VerificarAserciones {
	    public static void main(String[] args) {
	        boolean asercionesActivadas = false;
	        assert asercionesActivadas = true; // Esta l�nea se ejecutar� solo si las aserciones est�n activadas
	        if (asercionesActivadas) {
	            System.out.println("Las aserciones est�n activadas.");
	        } else {
	            System.out.println("Las aserciones NO est�n activadas.");
	        }
	    }
	

}

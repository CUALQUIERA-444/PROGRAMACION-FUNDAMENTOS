package ejaserciones;
/**
 * Detecta si las aserciones están activadas
 * @author begol
 *
 */

public class VerificarAserciones {
	    public static void main(String[] args) {
	        boolean asercionesActivadas = false;
	        assert asercionesActivadas = true; // Esta línea se ejecutará solo si las aserciones están activadas
	        if (asercionesActivadas) {
	            System.out.println("Las aserciones están activadas.");
	        } else {
	            System.out.println("Las aserciones NO están activadas.");
	        }
	    }
	

}

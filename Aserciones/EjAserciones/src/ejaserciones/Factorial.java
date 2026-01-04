package ejaserciones;
/**
 * Para activar las aserciones: Run As > Run Configuration > Arguments > VM Arguments  ---> ea
 * Para desactivarlas lo sustituimos por -----> da
 * @author begol
 *
 */

public class Factorial {
	public static void main(String[] args) {
		int numero = -5;
		int resultado = calcularFactorial(numero);
		System.out.println("El factorial de " + numero + " es " + resultado);
	}
	
	/**
	 * Calcula el factorial de un n�mero, si es negativo muestra un mensaje y termina
	 * @param n
	 * @return
	 */

	public static int calcularFactorial(int n) {
		// Aseguramos que el n�mero sea mayor o igual a cero
		assert n >= 0 : "El n�mero debe ser mayor o igual a cero, pero fue " + n;
		//Como ejecuto esto?
		//Run As, Run Configurations, Arguments,VM arguments, -ea
		//Desactivar
		//-da
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}

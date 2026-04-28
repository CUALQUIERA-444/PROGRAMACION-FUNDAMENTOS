package argumentosmain;
/**
 * Ejemplo de paso de parámetros o argumentos al main
 * @author begol
 *
 */
public class Argumentos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Número de argumentos recibidos:"+ args.length);
		System.out.println("Argumentos recibidos:");
		
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);

	}

}

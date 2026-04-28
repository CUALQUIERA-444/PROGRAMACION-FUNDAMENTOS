package EjerciciosExcepciones;

public class RangoInvalido extends Exception {

	public RangoInvalido() {
		// TODO Auto-generated constructor stub
		//Este ser tiene bastante contenido pero no se ve a simple vista o mejor dicho NO ESTA VACÍO
		//El main puede acceder al mensaje con e.getMessage un metodo de exception
	}

	public RangoInvalido(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	} //Pasa un texto especifico para detallar la excepcion
	//este texto se lo pasa al padre

	public RangoInvalido(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public RangoInvalido(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RangoInvalido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}

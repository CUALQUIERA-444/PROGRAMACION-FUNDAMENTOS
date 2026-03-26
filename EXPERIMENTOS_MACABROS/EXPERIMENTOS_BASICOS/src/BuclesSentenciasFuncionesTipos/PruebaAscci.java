package BuclesSentenciasFuncionesTipos;

public class PruebaAscci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Que pasa si imprimes a como caracter númerico?
		// char n = '97'; //Char solo admite un digito numerico
		int caracter = 'a'; 
		System.out.println(caracter); //La razon por la que da 97 es por el caracter a es reconocido como un int que vale 97
		//El casting permite sin importar las limitaciones del char imprimir el valor del caracter del codigo ASCII
		int numero = 97;
		char prueba = 'a';
		char caracter1 = (char)numero;
		System.out.println(caracter1);
		System.out.println((int)prueba);
		//Sumaar letras 
		char suma_letras = 'a' + 1;
		System.out.println(suma_letras);
	}
}

package Ejercicio13_6;

public class AlumnoMejorado {
	/*

	//Cada vez que se cree una clase lo recomendable es en singular 
	//Por que por lo general la clase define la estructura de UN UNICO OBJETO
	//Y además por que generalmente se reservan los nombres de este estilo para las colecciones
	//La razón por la que la primera letra esta en mayuscula es para ayudar al cerebro
	/* 
	 * Lógica codigo y notas 
	 * La idea es agrupar con el enunciado que cosas son propias de un alumno y ordenar las notas en base a eso
	 * Un alumno en este caso Tiene su numero de matricula y sus notas de tres asignaturas distintas 
	 * Un programa debe ser capaz de generar las notas; Un random deberia ir entre 0 y 10.
	 * Posteriormente creamos una función que les ordene las notas Este será estático pues realmente la ordenación no tiene dueño
	 */
	
		private String matrícula; //Solo puedes acceder mediante metodo caso contrario podrias acceder con el nombre del atributo
		//El numero de matricula generalmente es un String y la mayoria tiene letras 
		private double notaA;
		private double notaB;
		private double notaC;
		private static int contadorMedias; //Usualmente como atributo
		private double media; //Cada alumno es dueño de su media
		
		public AlumnoMejorado(String matricula) {
			final double divisor = 3;
			matrícula = matricula; //Necesita modificar el valor aunque pueda acceder al parametro
			notaA = GenerarNota(); 
			notaB = GenerarNota();
			notaC = GenerarNota();
			media = (notaA + notaB + notaC) / divisor;
			if(media >= 5) {
				contadorMedias++;
			}
		}
		private double GenerarNota() { //Si el main no tiene que llamar a la funcion se esconde
			//Por buena practica ademas de que debe pasar por el constructor para que se genere bien la media
			double nota = Math.random()*11; //Enter 0 y 10.99
			if (nota > 9.9) {
				return 10.0;
				}
			else 
				return nota;
		// ( random * 11 + 0 = 0 y 10.99
		}
		/* Me quiero ahorrar el pasarle las medias
		public void ordenarMedias() {
			//No se pueden referenciar campos no estaticos con una funcion estatica
			if()
		}
		*/
		public double getMedia() { //Obtenemos la media para comparar en el main
			return media;
		}
		@Override
		public String toString() {
			return "Alumno Mejorado [matrícula=" + matrícula + ", notaA=" + String.format("%.2f", notaA) + ", notaB=" + String.format("%.2f", notaB) + ", notaC=" + String.format("%.2f", notaC)
					+ ", media=" + String.format("%.2f", media) + "]"; //Modica el formato en el que se muestra 2 decimales
		}
		public static int getContadorMedias() {
			return contadorMedias;
		}
}

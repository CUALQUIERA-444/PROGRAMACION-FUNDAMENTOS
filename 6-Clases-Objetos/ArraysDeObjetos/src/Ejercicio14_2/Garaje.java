package Ejercicio14_2;
/*
 * Una empresa se dedica al alquiler de plazas de garaje. De cada uno de ellos guarda
el número que lo identifica, los metros cuadrados, la planta en la que está y el
precio de alquiler. El alquiler es de 18€ más
• 3€ si está en la 1a 1a planta
• 1,50€ si está en la 2a
• 1 si está en una planta inferior
Si el garaje tiene más de 4m2 pagará 1,5€ más sobre el precio anterior y si tiene
menos de 3m2 el precio disminuirá en 1€.
Programa que crea un array con 5 garajes, con un menú en el que aparezcan las
siguientes opciones:
- Alquilar un garaje: se pide el número y se busca en el array. Si no existe se
indica, si está alquilado se indica. Si está libre se procede a alquilarlo. Todos los
garajes se alquilan por un período de un año.
- Mostrar el precio de alquiler de un garaje: se pide su número
- Mostrar la información de los garajes que estén libres
- Subir el precio de un garaje: se pide por teclado un porcentaje y se aumenta el
precio de un garaje, sólo si está libre.
- Mostrar los beneficios de la empresa.
 */
public class Garaje {
	private int id_num; //Dato unico 
	private double m2;
	private int planta;
	private static double gananciasempresa;
	private double importe_total; //Si el dato se puede calcular al momento de crearlo pero necesita memoria se suele calcular en el constructor
	//Si no necesitara su memoria NO SE PONE COMO ATRIBUTO DEL OBJETO
	//Si este metodo fuera accesible con sets en el sentido de cambiar los valores originales de x objeto el calculo SI SE HARIA EN UN METODO
	//Y si no pues se hace esto aunque simplemente puede crear mas vehiculos
	private boolean libre = true; //Todos nacen libres
public Garaje(int id_num, double m2,int planta) {
	this.m2 = m2;
	this.planta = planta; //Se valida la planta antes de construirla
	this.id_num = id_num;
	double importe_temporal = 18;
	if (planta == 1) {
		importe_temporal += 3;
	}
	else if(planta == 2) {
		importe_temporal += 1.50;
	}
	else  //Planta menos valuable
		importe_temporal += 1;
	if (m2 > 4) {
		importe_temporal += 1.5;
	}
	else if (m2 < 3) {
		importe_temporal -= 1;
	}
	this.importe_total = importe_temporal;	
}
public void AlquilarGaraje() {
	//Se comprueba en el main si el identificador corresponde 
	//A un garaje si si pasa el identificador si no se indica 
	if(!Libre()) {
		System.out.println("Ya esta alquilado");
	}
	else {
		libre = false;
		gananciasempresa += importe_total;
		System.out.println("Garaje alquilado exitosamente");
	}
}
public double getImporte_total() {
	//Aunque generalmente se considera una estupidez ver el precio de algo alquilado 
	//Aca es razonable por razones cuestionables
	return importe_total;
}
@Override
public String toString() { //Se llama solo si el array cumple
	return "Garaje [id_num=" + id_num + ", m2=" + m2 + ", planta=" + planta + ", importe_total=" + importe_total
			+ ", libre=" + libre + "]";
}
public boolean Libre() {
	if(!libre) {
		return false;
	}
	else {
	return true;
	}
}
public static double getGananciasempresa() {
	return gananciasempresa;
}
public void SubirTarifa(double porcentaje) {
	if(!Libre())
		System.out.println("Ya esta alquilado");
	else {
	importe_total = importe_total + importe_total * porcentaje / 100;
	}
}
public int getId_num() {
	return id_num;
}

}


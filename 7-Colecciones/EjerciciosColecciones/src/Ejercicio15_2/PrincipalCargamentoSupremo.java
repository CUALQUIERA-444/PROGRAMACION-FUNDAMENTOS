package Ejercicio15_2;

import java.util.*;
public class PrincipalCargamentoSupremo {
	public static Scanner  sc = new Scanner(System.in);
	/*
	 * Utilizar la clase CargamentoFruta de la práctica de Clases para hacer un programa
	en el que se lleve un array de Cargamentos (máximo 10), inicialmente ninguno, con
	un menú en el que aparezcan las siguientes opciones:

	- Dar de alta un cargamento, sólo si hay espacio suficiente en el array.
	Se preguntará al principio del programa el tamaño del array (por
	teclado) (Debate con el usuario)
	- Mostrar toda la información de todos los cargamentos. 1
	- Rebajar un cargamento. Se pide por teclado el nombre de la fruta, la
	procedencia y la rebaja a efectuar, se busca en el array y si existe se
	le aplica la rebaja. 2
	- Vender. Se pide por teclado el nombre de la fruta y se busca el
	primer cargamento de esa fruta que haya, si hay suficientes
	unidades se realiza la venta, sino se busca el siguiente cargamento
	con dicho nombre de fruta. 3
	- Mostrar el beneficio obtenido por el almacén. 4
	- Borrar todos los cargamentos que tengan 0 kilos. 5
Modificar el ejercicio del Cargamento de Fruta realizado anteriormente,
sustituyendo el array por un ArrayList.
*/
	public static void main(String[] args) {
	sc.useLocale(Locale.ENGLISH);
		// TODO Auto-generated method stub
	//PASO 1 DAR DE ALTA UN CARGAMENTO SOLO SI HAY SUFICIENTE ESPACIO EN EL ARRAY DEBATIR CON EL USUARIO
	int tamaño = 0;
	//(String nombreF,String procedencia,int n_Kilos,double pc_Kilo, double pv_Kilo)
	String nombreF;
	String procedencia;
	int n_Kilos;
	String f_temporal;
	double pc_Kilo;
	double pv_Kilo;
	ArrayList <CargamentoSupremo> CargamentosM = new ArrayList<CargamentoSupremo>(); //No tiene un tamaño definido 
	//Size por defecto es 0 
	int opc;
	/*while (tamaño <= 0 || tamaño > 10) {
		System.out.println("Introduzca con cuantos cargamentos quiere operar \"Numero entero\"");
		tamaño = sc.nextInt();
		sc.nextLine(); //Limpiar buffer
		if(tamaño > 10) 
			System.out.println("Lo siento pero como maximo debe operar con 10 cargamentos");
		else if (tamaño <= 0) {
			System.out.println("Como minimo 1");
		}
	}
	*/ //No es necesario validar el tamaño en este punto es un ArrayList
	//Paso 1 Rellenar el arraylist hasta que el usuario diga basta
	String continuar;
	 for (int i = 0 ; i!=-1;) { //No se es divertido Se puede hacer un for infinito puesto que el size no me sirve de mucho
		 if(i != -1) {
		 System.out.println("Introduce el nombre de la fruta");
		 nombreF = sc.nextLine();
		 System.out.println("Introduce la procedencia de su cargamento de frutas");
		 procedencia = sc.nextLine();
		 System.out.println("Introduzca la cantidad de kilos totales de la fruta");
		 n_Kilos = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Introduzca el precio coste por kilo de la fruta");
		 pc_Kilo = sc.nextDouble();
		 sc.nextLine();
		 System.out.println("Introduzca el precio venta por kilo de la fruta");
		 pv_Kilo = sc.nextDouble();
		 sc.nextLine(); //Limpiar buffer
		 CargamentosM.add(new CargamentoSupremo(nombreF,procedencia,n_Kilos,pc_Kilo,pv_Kilo));
		 if(CargamentosM.size() >= 10) {
			 System.out.println("Ya está en el limite");
			 break;
		 } 
		 do {
		 System.out.println("Desea continuar? (SI|NO)");
		 continuar = sc.nextLine();
		 } while (!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO"));
		 if(continuar.equalsIgnoreCase("NO")) {
			 i = -1; //SOLO CAMBIA SI SE INTRODUCE NO 
		 }
		 }
		 //CargamentosM[i] = new CargamentoSupremo(nombreF,procedencia,n_Kilos,pc_Kilo,pv_Kilo);
	 }
	//PASO 3 HACER EL MENU 
	do {
		System.out.println("Seleccione la opcion que mas guste \n1.Mostrar toda la informacion de los cargamentos");
		System.out.println("2.Rebajar cargamentos de frutas");
		System.out.println("3.Vender cargamentos de frutas");
		System.out.println("4.Mostrar el beneficio obtenido por el almacen");
		System.out.println("5.Borrar todos los cargamentos que tengan 0 kilos");
		System.out.println("6.Salir/Terminar");
		opc=sc.nextInt();
		sc.nextLine();//Limpiar buffer 
	//PASO 4 REALIZAR EL SWITCH CASE 
		switch(opc) {
		case 1: //Mostrar la informacion de todos los cargamentos
			for (CargamentoSupremo aux: CargamentosM) {
				if(aux != null) {
				System.out.println(aux.toString());
				}
			}
		break;
		case 2: //Rebajar un cargamento
			CargamentoSupremo comprobante;
			System.out.println("Introduce el nombre de la fruta");
			f_temporal = sc.nextLine();
			comprobante = BuscarFruta(f_temporal,CargamentosM);
			if (comprobante == null) {
				System.out.println("No se encontro la fruta");
			}
			else {
				System.out.println("Indique la cantidad de rebaja que quiere aplicar (Dinero)");
				double rebaja = sc.nextDouble(); 
				sc.nextLine(); //Limpiar buffer
				comprobante.Rebajar(rebaja); //Aplica el cambio al objeto Los set sirven para cambiar todo el objeto
			}
		break;
		case 3:
			CargamentoSupremo comprobante2; 
			System.out.println("Introduce el nombre de la fruta");
			f_temporal = sc.nextLine();
			comprobante2 = BuscarFruta2(f_temporal,CargamentosM); 
			if(comprobante2 != null) {
				System.out.println("Venta realizada con exito");
			}
		break;
		case 4:
			System.out.printf("%.3f € \n",CargamentoSupremo.getBeneficio_general());
		break;
		case 5:
			BorrarCargamentosCeroKilos(CargamentosM);
		break;
		case 6:
		break;
		}
	}
	while (opc != 6);
	System.out.println("Fin del programa");
	}
	public static CargamentoSupremo BuscarFruta (String fruta_temporal,ArrayList<CargamentoSupremo> cargamentosM) {
		for(CargamentoSupremo aux: cargamentosM ) {
			if(aux != null && aux.getNombreF().equalsIgnoreCase(fruta_temporal)) {
				return aux;
			}
		}
		return null;
	}
	public static CargamentoSupremo BuscarFruta2 (String fruta_temporal,ArrayList<CargamentoSupremo> cargamentosM) {
		//Guardada en una variable o no se ejecuta
		int cantidad;
		boolean frutaEncontrada = false;
		System.out.println("Introduzca la cantidad de fruta que quiere coger");
		cantidad = sc.nextInt();
		sc.nextLine(); //limpiar buffer
		for(CargamentoSupremo aux: cargamentosM ) {
			if(aux != null && aux.getNombreF().equalsIgnoreCase(fruta_temporal)) {
				frutaEncontrada = true;
				if(aux.Vender(cantidad) != 0) { //No se va a mostrar si no la pones en una variable la estarias llamando 2 veces provocando que el codigo se ejecute 2 veces
					return aux;
				}
				}
			}
		if(!frutaEncontrada) {
			System.out.println("No se encontro la fruta");
		}
		else {
			System.out.println("No hay suficiente stock ");
		}
		return null;
		}
	public static void BorrarCargamentosCeroKilos(ArrayList <CargamentoSupremo> CargM) {
		//Esto es lo mas dificil (Mas o menos lo enetiendo) 
		//Esencialmente este metodo se encarga de sobreescribir las posiciones moviendo el contenido 
		//Una casilla hacia atras 
		//AL usar un ArrayList podemos simplemente usar un iterator
		Iterator <CargamentoSupremo> it = CargM.iterator(); //Declara iterator
		while(it.hasNext()) {
			//SOLO SE PUEDE INTERACTUAR CON EL RESULTADO DE 
			//IT UNA SOLA VEZ SIN GUARDARLO EN UNA VARIABLE 
			//TEMPORAL CASO CONTRARIO ES NECESARIO GUARDARLO
			//EN UNA VARIABLE TEMPORAL 
		CargamentoSupremo M9 = it.next();
		if(M9.getN_Kilos() == 0) {
			it.remove();
		}
		}
			}
}

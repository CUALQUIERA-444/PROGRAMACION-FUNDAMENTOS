package ej1ArrayReales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1[]= {3,4.5,7,12,9};
		
		ArrayReales miArr=new ArrayReales(a1);
		
		System.out.println("El minimo es:"+miArr.minimo());
		System.out.println("El sumatorio es:"+miArr.sumatorio());

	}

}

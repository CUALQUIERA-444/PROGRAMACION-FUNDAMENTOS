package practica3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,provincia,tipo,numOp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Anota un número de 4 dígitos cómo máximo:");
		num=sc.nextInt();
		//if (num>=1000 && num<=9999)
		if(num>9999)
			System.out.println("ERROR:CÓDIGO NO VÁLIDO");
		else {
			provincia=num/1000;
			num=num%1000;
			tipo=num/100;
			numOp=num%100;
			System.out.print("Provincia:"+provincia+"\nTipo:"+tipo+"\nNumero Operacion:");
			if(numOp<10)
				System.out.print("0");
			System.out.println(numOp);
		}

	}

}

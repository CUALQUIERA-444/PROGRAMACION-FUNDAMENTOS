package ejerciciosarrays;

public class Ejercicio7 {

	public Ejercicio7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros1[]= {4,7,2,1,3};
		int numeros2[]= {2,8,9,4,5};
		
		System.out.println("Números en ambos arrays");
		for(int i=0;i<numeros1.length;i++) {
			if (esta(numeros2,numeros1[i])==true)
				System.out.println(numeros1[i]);	
		}
			
	}
	
	public static boolean esta(int numeros[],int num) {
		for(int i=0;i<numeros.length;i++)
			if (numeros[i]==num)
				return true;
		return false;
	}

}

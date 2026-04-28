package ej1ArrayReales;

public class ArrayReales implements Estadisticas {
	private double[]numeros;

	
	public ArrayReales(double[] numeros) {
		super();
		this.numeros = numeros;
	}
	
	
	public double minimo() {
		// TODO Auto-generated method stub
		double min=Double.MAX_VALUE;
		for (int i=0; i<numeros.length; i++)
			if (numeros[i]<min)
				min=numeros[i];
		return min;
	}


	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		double sumatotal=0;
		for (int i=0; i<numeros.length; i++)
			sumatotal+=numeros[i];
		return sumatotal;
	}
	

}

package Ejercicio1;

public class Ejercicio1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Cree una clase empleado y pruebe su funcionalidad. 
 * Las variables de ejemplar que debe considerar son nombre, 
 * apellido y salario anual. Además de los métodos de consulta y actualización de las variables,
 * considere dos métodos más. Uno de ellos devolverá el salario mensual. El otro método devolverá 
 * un extra calculado como un porcentaje del salario anual más 1000. 
 * El porcentaje es un parámetro que se pasa al método.
 */
	Empleado[] empleados= new Empleado[2]; //Avisa la necesidad de espacio
	Empleado e1 = new Empleado();
	Empleado e2 = new Empleado ("Antonio","Aco",10000);
	e1.setNombre("Ramón"); 
	e1.setApellido("Valvez");
	e1.setSalario_anual(30000);
	empleados[0] = e1;
	empleados[1] = e2;
	for (int i = 0; i<empleados.length-1;i++) {
		empleados[i] = e1;
		System.out.println("Nombre del empleado:"+empleados[i].getNombre());
		System.out.println("Apellido del empleado:"+empleados[i].getApellido());
		System.out.println("Salario anual del empleado:"+empleados[i].getSalario_anual());
		System.out.println("Salario mensual del empleado:"+empleados[i].salarioMensual());
		System.out.println("Extra del empleado:"+empleados[i].extra(20.5));
	}
	}
}

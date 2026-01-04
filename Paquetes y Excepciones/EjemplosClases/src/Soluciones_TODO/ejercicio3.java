package Soluciones_TODO;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha=null;
		int dia, mes, año, dias=0;
		boolean correcto = false;

		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduce dia:");
				dia = sc.nextInt();
				System.out.println("Introduce mes:");
				mes = sc.nextInt();
				System.out.println("Introduce año:");
				año = sc.nextInt();

				fecha = LocalDate.of(año, mes, dia);
				correcto = true;
			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("No se pueden introducir caracteres");
			}

		} while (correcto == false);

		correcto = false;
		do {

			try {
				System.out.println("Introduce número de días:");
				dias = sc.nextInt();
				correcto=true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("No se pueden introducir caracteres");
			}
		} while (!correcto);
		
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yy");
		
		System.out.println(fecha.plusDays(dias).format(patron));

	}

}

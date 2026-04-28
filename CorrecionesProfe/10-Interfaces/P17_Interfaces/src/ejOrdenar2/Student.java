package ejOrdenar2;

import java.time.LocalDate;

class Student {
	private int number;
	private String name;
	private int age;
	private LocalDate fecha;



	public Student(int number, String name, int age, LocalDate fecha) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.fecha = fecha;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + ", fecha=" + fecha + "]";
	}

	public int getAge() {
		return age;
	}

}

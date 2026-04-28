package ej3Ordenar;




import java.time.LocalDate;

class Student implements Comparable<Student> {
	private int number;
	private String name;
	private int age;
	private LocalDate fincorporación;

	Student(int nu, String name, int age) {
		this.number = nu;
		this.name = name;
		this.age = age;
	}

	public Student(int number, String name, int age, LocalDate fincorporación) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.fincorporación = fincorporación;
	}
/*
	public int compareTo(Student st) {
		return -1*fincorporación.compareTo(st.fincorporación);
	}
*/
	// Para ordenar por edad de menor a mayor y a misma edad por fincorporación
	public int compareTo(Student st) {
		if (age<st.age)
			return -1;
		if (age>st.age)
			return 1;
		return fincorporación.compareTo(st.fincorporación);
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + ", fincorporación=" + fincorporación
				+ "]";
	}
	
/*
	public int compareTo(Student st) {
		return name.compareTo(st.name)*-1;
	}
*/
	

}

package ejOrdenar2;

import java.util.Comparator;

public class StudentPorFecha implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		
		return arg0.getFecha().compareTo(arg1.getFecha());
	}

}

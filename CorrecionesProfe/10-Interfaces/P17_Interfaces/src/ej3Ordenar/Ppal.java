package ej3Ordenar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Ppal {
	public static void main(String args[]){  
		//ArrayList<Student> al=new ArrayList<Student>();  
		Vector <Student> al=new Vector();
		al.add(new Student(101,"Luis",23,LocalDate.of(1025, 1, 12)));  
		al.add(new Student(106,"Gemma",27,LocalDate.of(1024, 2, 12)));  
		al.add(new Student(105,"Pedro",27,LocalDate.of(1025, 7, 12)));  
		  
		Collections.sort(al);  
		
		for(Student st:al){  
			System.out.println(st);
		}  
		 
	}  
}

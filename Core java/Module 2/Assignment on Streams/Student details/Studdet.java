package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Studdet {
	public static void main(String [] args) {
		List<Student>s= Arrays.asList(
				new Student(12, "Guna", 19),
				new Student(13, "Arun", 19),
				new Student(12, "Rushi", 2),
				new Student(14, "Vaigarai", 3),
				new Student(11, "Rushi", 22)
				);
		
		
		s.stream()
	     .filter(p-> p.getAge()>18)
	     .findFirst()
	     .orElse(null);
		
		System.out.println("Students whose age is greater than 18 are:"+s);
		
		List<String>disnames =s.stream()
		.map(Student::getName)
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("Students with distinct names are:"+disnames);
		
	  double avgAge = s.stream()
	    .mapToInt(Student::getAge)
	    .average()
	    .orElse(0.0);
	  System.out.println("average age of Students: "+avgAge);
}
}

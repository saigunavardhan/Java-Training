package FunctionalInterfaces;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<StudentMarks> students = Arrays.asList(
				new StudentMarks("Alice", 85.6),
				new StudentMarks("Jane", 92.7),
				new StudentMarks("Arun", 9.7),
				new StudentMarks("Kurm", 19.7),
				new StudentMarks("Ajay", 62.7),
				new StudentMarks("Gina", 91.4),
				new StudentMarks("Jasmine", 82.5)
				);
				
	students.stream()
			.filter(sm-> sm.getMarks()>=80.00)
			.forEach(sm-> System.out.println("Congratulate" +sm.getName()+"for getting marks of"+sm.getMarks()));
	}
	
}



class StudentMarks{
	private String name;
	private double marks;
	public StudentMarks(String name, double marks){
		this.name = name;
		this.marks = marks;
	}
	

	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	

	
}

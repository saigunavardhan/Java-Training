package FunctionalInterfaces;

public class Student {
	private Integer rollno;
	private String name;
	private int age;
	
	public Student(Integer rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		
	}

	public Integer getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
public String toString() {
	return "Student{" +
            "rollno=" + rollno +
            ", name='" + name + '\'' +
            ", age =" + age +
            '}';
			
}
}

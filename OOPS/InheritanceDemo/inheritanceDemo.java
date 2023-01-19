package OOps;

public class inheritanceDemo {
	String name;
	int empcode;
	
	public inheritanceDemo(String name, int empcode) {
		this.name = name;
		this.empcode = empcode;
		}
		
		public String getname() {
			return name;
		}
		void setname(String name) {
			this.name = name;
		}
		int getempcode() {
			return empcode;
		}
		void setempcode(int empcode){
			this.empcode = empcode;
		}
		public void payslip() {
			System.out.println("Not defined");
		}
		}

class Salaried extends inheritanceDemo{
	double salary;
	
	Salaried(String name, int empcode, double salary){ 
	super( name,empcode);
	this.salary = salary;
		}
	double getsalary() {
		return salary;
		}
	void setsalary(double salary) {
		this.salary = salary;
		
		}
public void payslip(){	
	System.out.println("code:" + getempcode());
	System.out.println("Name:" +getname());
	System.out.println("Salry:" +getsalary());
		}
		}

class Intern extends Salaried{
	String University;
	
	Intern(String name, int empcode, double salary, String University){
		super(name, empcode, salary);
		this.University = University;	
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		this.University = university;
	}
	
	public void payslip(){	
		System.out.println("code:" + getempcode());
		System.out.println("Name:" +getname());
		System.out.println("Salry:" +getsalary());
		System.out.println("University:" +getUniversity());
	}
	
	
}



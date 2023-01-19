package OOps;

public class Company {
	public static void main(String[] args){
		inheritanceDemo emp1 = new Salaried("Guna",111, 250000);
		emp1.payslip();
		
		Salaried emp2 = new Intern ("John",2222, 25000, "MIT");
		emp2.payslip();
		
	}
}

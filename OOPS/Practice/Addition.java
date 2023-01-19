package Practice;
import java.util.Scanner;

public class Addition {
	
	private static float num1;
	private static  float num2;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.println("Enter 1st numner: ");
		float num1 = s.nextFloat();
		System.out.println("Enyter 2nd numner: ");
		float num2 = s.nextFloat();
		
		if (num1%2 == 0) {
			System.out.println("Given 1st number is even");
		}
		
		else {
			System.out.println("Given 1st number is odd");
		}
		
		if (num2%2 == 0) {
			System.out.println("Given 2nd number is even");
		}
		
		else {
			System.out.println("Given 2nd number is odd");
		}
		
		float Addition = (num1 +num2);
		System.out.println("Addition of" +num1+ "and" +num2+ "is:" +Addition);
		
		float Division = (num1/num2);
		System.out.println("Division of" +num1+ "and" +num2+ "is:" +Division);
		
		float Multiplication = (num1*num2);
		System.out.println("Multiplication of" +num1+ "and" +num2+ "is:" +Multiplication);
		
		float Subtraction = (num1-num2);
		System.out.println("Subtraction of" +num1+ "and" +num2+ "is:" +Subtraction);
		
		float Mod = (num1%num2);
		System.out.println("Mod of"+" "+num1+" "+"and"+" " +num2+ "is:"+" "+Mod);
		
		System.out.printf("Factorial of is given number is" +num2);
	
		System.out.println("DO you want to swap numbers (Yes/no):");
		String response = s.next();
		if(response.equalsIgnoreCase("yes")) {
			
			float temp = num1;
			num1 = num2;
			System.out.println("The num1 became " +num1);
			
			num2 = temp;
			System.out.println("The num2 became " +num2);
		}
		
		s.close();
			
	}
}

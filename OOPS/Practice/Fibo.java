package Practice;

public class Fibo {
	
	public static void main(String [] args) {
		int n= 9, first_term = 2, Second_term = 3;
		System.out.println("Fionacci series of terms till" +n+ "is :");
		
		for(int i=0; i<=n; ++i) {
			System.out.println(first_term+",");
			
			int next_term = first_term+ Second_term;
			first_term = Second_term;
			Second_term = next_term;
			}
		}
	}

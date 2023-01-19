package FunctionalInterfaces;



public class Count {
	
	public static long count(String s, char c) {
		return s.chars()
				.filter(p-> p == c)
				.count();
	}
public static void main(String [] args) {
		String str = "abababc";
		char ch = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		
		
	System.out.println(count(str, ch));
	System.out.println(count(str, ch2));
	System.out.println(count(str, ch3));
	
}
}

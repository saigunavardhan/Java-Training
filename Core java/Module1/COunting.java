package Module1;

import java.util.Scanner;

public class COunting {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Choose a number to count");
		int number = s.nextInt();
		
		System.out.println("Nice");
		for(int i = 0; i<=number;i++) {
			System.out.println(i+ " ");
		}
		
		
	}
	
}

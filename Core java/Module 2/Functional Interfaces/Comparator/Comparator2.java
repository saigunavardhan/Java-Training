package FunctionalInterfaces;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;



public class Comparator2 {
	public static void main(String[] args) {
		List<String>Books = Arrays.asList(
				"Pride and Prejudice",
				"The Picture of Dorian Gray",
				"Moby-Dick",
				"The Brothers Karamazov",
				"One Hundred Years of Solitude",		
				"The Alchemist",
				"The Catcher in the Rye",
				"The Great Gatsby",
				"The Lord of the Rings",
				"To Kill a Mockingbird");

		Collections.sort(Books);	
		System.out.println("Sorted order: " +Books);
	}
	

}

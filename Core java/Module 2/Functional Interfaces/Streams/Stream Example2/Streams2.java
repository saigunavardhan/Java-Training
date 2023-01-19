package FunctionalInterfaces;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Streams2 {
	public static void main(String[] args) {
        List<Books> books = Arrays.asList(
				new Books("Romance", 1847, 5.97, "jane Eyre" ),
				new Books("Horror", 1845, 6.10, "goosebumps" ),
				new Books("Romance", 1813, 6.71, "Pride and Prejuidice" ),
				new Books("Thrilling", 2012, 30.10, "A Silent Patient" ),
				new Books("Romance", 1847, 8.08, "Wuthering Heights" )
        );

        System.out.println("\nThese books are on sale\n-----------------------");
        books.stream() 
            .filter(book -> book.getGenre().equals("Romance"))
            .map(book -> new Books(book.getGenre(), book.getYear(), book.getPrice() / 2, book.getName()))
            .sorted((right, left) -> right.getYear().compareTo(left.getYear()))
            .forEach(book -> System.out.println(book.getGenre()+" "+book.getYear()+" "+book.getPrice()+" "+book.getName()));
    }
}


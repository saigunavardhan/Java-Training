package FunctionalInterfaces;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;
import java.util.Arrays;

public class ConsumerFunction {
	
	public static void main(String [] args) {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");
		
		Date[] dates = {
				new Date(120, 0, 1),
				new Date(120, 1, 15),
                new Date(120, 2, 30), 
                new Date(120, 3, 1), 
                new Date(120, 4, 15), 
                new Date(120, 5, 30)
			};
		double[] amounts = {100.0, 200.0, 300.0, 50.0, 75.0, 100.0};
		
		
		Arrays.asList(dates).forEach(date->{
		
		int index = Arrays.asList(dates).indexOf(date);
		System.out.println("Date: " +d.format(date));
		System.out.println("Amount: " +amounts[index]);
		System.out.println("-----");
		});
		
 	}
}

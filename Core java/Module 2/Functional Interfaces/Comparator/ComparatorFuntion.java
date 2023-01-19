package FunctionalInterfaces;

import java.util.List;
import java.util.Arrays;

public class ComparatorFuntion {
	public static void main(String[] args) {
		List<Double>amount = Arrays.asList(33.99,55.99,77.99,55.99,11.49,111.99,88.99);
		amount.sort((right, left)->{
		return left.compareTo(right);
		});
		System.out.println("Sorted list: " +amount);
		
		
	}
}

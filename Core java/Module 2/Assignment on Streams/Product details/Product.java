package FunctionalInterfaces;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class Product {
	public static void main(String [] args) { 
		List<Products> p = Arrays.asList(
							new Products(2, "Us polo Shirt", 99.00),
							new Products(3, "Arrow Shirt", 19.00),
							new Products(6, "UCB shirt", 29.00),
							new Products(7, "Tommy Hilfiger watch", 1999.00));
		double maxPrice = p.stream()
                .mapToDouble(Products::getPrice)
                .max()
                .orElse(0.0);
        System.out.println("Max Price: " + maxPrice);

        double minPrice = p.stream()
                .mapToDouble(Products::getPrice)
                .min()
                .orElse(0.0);
        System.out.println("Min Price: " + minPrice);
        
        Products maxPriceProduct = p.stream()
        	    .filter(s -> s.getPrice() == maxPrice)
        	    .findFirst()
        		.orElse(null);
        System.out.println("Max Price Product: " + maxPriceProduct);

        	Products minPriceProduct = p.stream()
        	    .filter(s -> s.getPrice() == minPrice)
        	    .findFirst()
        	    .orElse(null);
        	System.out.println("Min Price Product: " + minPriceProduct);
    }
	
}


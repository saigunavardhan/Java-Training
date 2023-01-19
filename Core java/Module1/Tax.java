package Module1;

import java.util.Arrays;

public class Tax {
public static void main(String[] args) {
	double[] price = {1.89, 1.22, 1.34, 1.44};
	double[] aftertax = new double [price.length];
	
	for(int i =0; i<price.length; i++) {
		aftertax[i] = price[i]*1.13;
	}
	System.out.println("Prices" + Arrays.toString(price));
	System.out.println("Prices" +Arrays.toString(aftertax));
}
}

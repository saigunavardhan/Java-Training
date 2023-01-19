package Module1;

public class RestaurantTip {
public static void main(String[] args) {
    double bill = 99.9;
	System.out.println("Thanks for having ur meal here");
	tip(bill);
}

public static void tip(double bill) {
	double tip = bill*0.8;
	System.out.println("Thanks for ur service please have this tip $" +tip);
	
}

	
}

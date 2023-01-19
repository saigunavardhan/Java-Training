package Module1;


public class Liquid {
	public static void main(String [] args) {
		String [] Drinks = { "Milk shake", "Juices", "Coffee", "Tea", "water","THick Shakes"};
		System.out.println("DO you have some Water?");
		for(int i =0; i<=Drinks.length;i++) {
			if(Drinks[i].equals("water")) {
				System.out.println("Yes we have " +Drinks[i]+ " at " +i);
				break;
				
			}
		}
			
	}
}

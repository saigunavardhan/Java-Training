package Module1;

public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 1000;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.70;

        System.out.println("One customer walked in. He bought 6 apples!");
        numOfApples -= 6;
        numOfCustomers++;
        profit += 6*price;

        System.out.println("2 customer walked in. He bought 120 apples!");
        numOfApples -= 120;
        numOfCustomers+=2;
        profit += 120*price;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 500;
        numOfCustomers++;
        profit += 500*price;

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left. We'll sell more tomorrow!");

    }

}
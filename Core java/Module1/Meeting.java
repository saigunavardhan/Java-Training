package Module1;

public class Meeting {
    public static void main(String[] args) {

        double sales = 24309444.65; 
        double profit = 1853362.18; 
        double refunds = 68228.78; 
        double shipping = 122333.57; 

        //Type casting
        System.out.println("This month, we made $"+ (int)sales+ " in sales");
        System.out.println("Factoring in costs, we made $"+(int)profit+" in profit");
        System.out.println("The refunds are at a low $"+(int)refunds+". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $"+(int)shipping+" in shipping");


    }
}

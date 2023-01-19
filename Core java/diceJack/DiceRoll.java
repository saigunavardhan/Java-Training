package diceJack;


import java.util.Scanner;

public class DiceRoll {
	
	public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);
	    boolean Game = true;
	    
	    while (Game) {
	        int roll1 = rollDice();
	        int roll2 = rollDice();
	        int roll3 = rollDice();
	
	        System.out.println("Enter three numbers between 1 and 6: ");

	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();
	        int num3 = scan.nextInt();

	        if (num1 <1 || num2<1 || num3<1 && num1>6 || num2>6 || num3>6) {
	        	
	            System.out.println("Sorry numbers should be between one and 6. Game over");
	            
	        }

	        int sumNum = (num1+num2+num3);
	        int sumRoll = (roll1+roll2+roll3);
	        
	        System.out.println("Sum of numbers = "+sumNum+ ". Sum of rolled numbers = "+sumRoll);
	        
	        Game = checkWin(sumNum, sumRoll);
	        if(!Game){
	        	
	        System.out.println("Do you want to play again? (yes/no) ");
	        
	        String response = scan.next();
	        if (response.equalsIgnoreCase("no")) {
	            Game = false;
	        }
	        }
	    }
	    System.out.println("Thanks for playing!");
	    }

	public static int rollDice() {
	    double randNum = Math.random()*6;
	    randNum += 1;
	    return (int) randNum;
	    }

	public static boolean checkWin(int sumNum, int sumRoll) {
	    if (sumNum>sumRoll && sumNum - sumRoll < 3) {
	        System.out.println("You won ;)");
	        return true;
	    }
	    else {
	        System.out.println("You lose!");
	        return false;
	    }
	}
	
}

package basic;

import java.util.*;

public class Pizza {
	static int numberOfToppings;
	
	//Constructor
	public Pizza(int x) {
		numberOfToppings = x;
	}
	
	//Methods
	static String pizzaName1() {
		return ("This is Dominos");
	}
	
	static String pizzaName2() {
		return ("This is PapaJohn's");
	}
	
	
	static String pizzaName3() {
		return ("This is PizzaHut");
	}
	
	static int tops() {
		return numberOfToppings;
	}
	
	
	public static void main(String[]args) {
		System.out.println("Please enter the number which restaurant you want to shop from?\n Press 1 for DOminos\n Press 2 for PapaJohn's\n Press 3 for PizzaHut");
	    Scanner toppingInput = new Scanner(System.in);
	    Scanner userInput1 = new Scanner(System.in);
	    int rest = userInput1.nextInt();
	    if (rest == 1) {
	    	
	    	System.out.println(pizzaName1());
	    	Scanner userInput = new Scanner(System.in);
	    	
	    	System.out.println("Enter how many toppings youn want");
	    	int toppings = userInput.nextInt();
	    	Pizza mypizza = new Pizza(toppings);
	    	System.out.println("Okay you want" + tops()+"toppings");
	    	System.out.println("Name the toppings");
	    	for (int i=0; i<toppings;i++) {
	    		
	    		String toppingIn = toppingInput.nextLine();
	    		System.out.println("What else?");
	    	}
	 	 }
	    
	    else if(rest ==2) {
	    	
	    	System.out.println(pizzaName2());
	    	Scanner userInput = new Scanner(System.in);
	    	
	    	System.out.println("Enter how many toppings youn want");
	    	int toppings = userInput.nextInt();
	    	Pizza mypizza = new Pizza(toppings);
	    	System.out.println("Okay you want" + tops()+"toppings");
	    	System.out.println("Name the toppings");
	    	for (int i=0; i<toppings;i++) {
	    		
	    		String toppingIn = toppingInput.nextLine();
	    		System.out.println("What else?");
	    	}	
     }
	
else if(rest ==3) {
	    	
	    	System.out.println(pizzaName3());
	    	Scanner userInput = new Scanner(System.in);
	    	
	    	System.out.println("Enter how many toppings youn want");
	    	int toppings = userInput.nextInt();
	    	Pizza mypizza = new Pizza(toppings);
	    	System.out.println("Okay you want" + tops()+"toppings");
	    	System.out.println("Name the toppings");
	    	for (int i=0; i<toppings;i++) {
	    		
	    		String toppingIn = toppingInput.nextLine();
	    		System.out.println("What else?");
	
	    	}
        }
	    
	    
else {
	System.out.println("I don't understand. Please try again");
}
	
	System.out.println("I have received your order. Please wait. Thank you!");
	
	}
	
}

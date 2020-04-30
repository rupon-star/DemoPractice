package basic;
import java.util.*;

public class Computer {
	static int numberOfFunction;
		
		//Constructor
		public Computer(int x) {
			numberOfFunction = x;
		}
		
		//Methods
		static String computerName1() {
			return ("This is Apple");
		}
		
		static String computerName2() {
			return ("This is Dell");
		}
		
		static String computerName3() {
			return ("This is Acer");
		}
		
		
		static int tops() {
			return numberOfFunction;
		}
		
		public static void main(String[] args ){
			System.out.println("Please enter the number which indicate computer name\n Press 1 for Apple\n Press 2 for Dell\n Press 3 for Acer");
			Scanner Input = new Scanner(System.in);
			Scanner userInput1 = new Scanner(System.in);
			int rest = userInput1.nextInt();
			if (rest == 1) {
				System.out.println(computerName1());
				Scanner functionInput = new Scanner(System.in);
				System.out.println("How many function need ");
				int function = functionInput.nextInt();
				Computer mycomputer = new Computer(function);
				System.out.println("Okay you want " + " computer");
				System.out.println("Name the computer");
				for (int i = 0; i < function; i++) {
					String functionIn = functionInput.nextLine();
					System.out.println("What else?");
				}
				
			}
			else if(rest == 2) {
				System.out.println(computerName2());
				Scanner functionInput = new Scanner(System.in);
				System.out.println("How many function you want");
				int function = functionInput.nextInt();
				Computer mycomputer = new Computer(function);
				System.out.println("Okay you want "+  " function");
				System.out.println("Name the function");
				for (int i = 0; i < function; i++) {
					String functionIn = functionInput.nextLine();
					System.out.println("What else?");
				}
				
			}
			else if(rest == 3) {
				System.out.println(computerName3());
				Scanner functionInput = new Scanner(System.in);
				System.out.println("How many function you want");
				int function = functionInput.nextInt();
				Computer mycomputer = new Computer(function);
				System.out.println("Okay you want "+ " function");
				System.out.println("Name the function");
				for (int i = 0; i < function; i++) {
					String function1In = functionInput.nextLine();
					System.out.println("What else?");
				}
				
			}
			else {
				System.out.println("I don't understand. Please try again");
			}
			
			System.out.println("I have recevied your order. Please wait. Thank you!");
		}
				
	}
	



package basic;
import java.util.*;

public class Mobile {
	static int nameofModel;
		
		//Constructor
		public Mobile(int x) {
			nameofModel = x;
		}
		
		//Methods
		static String mobileName1() {
			return ("This is I Phone");
		}
		
		static String mobileName2() {
			return ("This is Samsung");
		}
		
		static String mobileName3() {
			return ("This is Nokia");
		}
		
		
		static int model() {
			return nameofModel;
		}
		
		public static void main(String[] args ){
			System.out.println("Please enter the number which indicate mobile name\n Press 1 for I Phone\n Press 2 for Samsung\n Press 3 for Nokia");
			Scanner Input = new Scanner(System.in);
			Scanner userInput1 = new Scanner(System.in);
			int rest = userInput1.nextInt();
			if (rest == 1) {
				System.out.println(mobileName1());
				Scanner modelInput = new Scanner(System.in);
				System.out.println("How many function need ");
				int model = modelInput.nextInt();
				Mobile mymobile = new Mobile(model);
				System.out.println("Okay you want " + " mobile");
				System.out.println("Name the mobile");
				for (int i = 0; i < model; i++) {
					String modelIn = modelInput.nextLine();
					System.out.println("What else?");
				}
				
			}
			else if(rest == 2) {
				System.out.println(mobileName2());
				Scanner modelInput = new Scanner(System.in);
				System.out.println("How many function you want");
				int model = modelInput.nextInt();
				Mobile mymobile = new Mobile(model);
				System.out.println("Okay you want "+  " function");
				System.out.println("Name the function");
				for (int i = 0; i < model; i++) {
					String modelIn = modelInput.nextLine();
					System.out.println("What else?");
				}
				
			}
			else if(rest == 3) {
				System.out.println(mobileName3());
				Scanner modelInput = new Scanner(System.in);
				System.out.println("How many function you want");
				int model = modelInput.nextInt();
				Mobile mymobile = new Mobile(model);
				System.out.println("Okay you want "+ " function");
				System.out.println("Name the function");
				for (int i = 0; i < model; i++) {
					String modelIn = modelInput.nextLine();
					System.out.println("What else?");
				}
				
					}
			else {
				System.out.println("I don't understand. Please try again");
			}
			
			System.out.println("I have recevied your order. Please wait. Thank you!");
		}
				}


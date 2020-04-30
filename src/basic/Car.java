package basic;
import java.util.*;

public class Car {
	int speed;
  String model;
  String color;
	
  public static void findModel(int speed,String model, String color) {
		System.out.print("Enter your desired car color: ");
		Scanner input=new Scanner(System.in);
		String carColor = input.nextLine();
		System.out.print(carColor + " is a great choice! \nHow fast do you like to drive?");
int carSpeed = input.nextInt();
		if (carSpeed<60) {System.out.println
			("Wow! You are a safe driver! \n You should go with this car model: "+carColor+" Ferrari 2020");}
		else {System.out.print("You sure like to drive fast! You should consider this model: "+carColor+" BMW 2020");
	input.close();
		}
	}

	Car(){
		
				Car.findModel(speed, model, color);
	
	}
	
public static void main(String [] args) {
	new Car();
	
	
	
	
}		}



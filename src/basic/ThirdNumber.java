package basic;
import java.util.Scanner;

public class ThirdNumber {
	public static void main(String[]args) {
		
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: 1524 ");
        double x = in.nextDouble();
        System.out.print("Input second number: 2345 ");
        double y = in.nextDouble();
        System.out.print("Input third number: 3321 ");
        double z = in.nextDouble();
       
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
       
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

	


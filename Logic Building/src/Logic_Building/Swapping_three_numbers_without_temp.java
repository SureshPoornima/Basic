package Logic_Building;
import java.util.Scanner;
public class Swapping_three_numbers_without_temp {

	public static void main(String []args) {
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		num3 = sc.nextInt();
		 
		num1 = num1 + num2;
		num2 = num1 - num2;
		num3 = num1 - num2;
		System.out.println("After swapping first number: "+ num1);
		System.out.println("second number: "+ num2);
        System.out.println("third number: "+num3);
	}
}

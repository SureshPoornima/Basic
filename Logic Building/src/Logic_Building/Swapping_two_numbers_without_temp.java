package Logic_Building;
import java.util.Scanner;
public class Swapping_two_numbers_without_temp {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		num1 = sc.nextInt();
		System.out.println("enter the second number");
		num2 = sc.nextInt();
		 
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping numbers are num1:"+num1);
	    System.out.println(",num2: "+num2);
		
	}

}

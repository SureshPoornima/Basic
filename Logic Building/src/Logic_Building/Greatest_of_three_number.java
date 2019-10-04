package Logic_Building;
import java.util.Scanner;
public class Greatest_of_three_number {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	int num3;
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	if(num1 > num2 && num1 > num3)
	{
	 System.out.println("number1");
	}
	else if(num2 > num3)
	{
		System.out.println("number2");
	}
	else
	{
		System.out.println("number3");
	}
}
}

package Logic_Building;
import java.util.Scanner;
public class Power_of_a_Number {
	public static void main(String []args) {
		int base;
		int power;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		power = sc.nextInt();
		
		for(int i = 1;i<= power; i++)
		{
		  result = result * base;
		}
		System.out.println(result);
	}

}

package Logic_Building;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int num;
	int flag = 0;
	num = sc.nextInt();
	int m = num /2;
	for(int i = 2; i< m;i++)
	{
		if(num % i == 0)
		{
			flag = 1;
			break;
		}
	}
	if (flag == 0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not prime");
	}
}
}

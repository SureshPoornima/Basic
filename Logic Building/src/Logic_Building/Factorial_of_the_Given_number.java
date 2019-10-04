package Logic_Building;
import java.util.Scanner;
public class Factorial_of_the_Given_number {
  public static void main(String []args) {
	  int sum = 1, n;
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  for(int i = 1; i<=n; i++) {
		  sum = sum * i;
	  }
	  System.out.println(sum);
  }
}

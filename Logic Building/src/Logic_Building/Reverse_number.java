package Logic_Building;

import java.util.Scanner;

public class Reverse_number {
 public static void main(String[]args) {
	 int n;
	 int reverse =0;
	 Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	 while( n != 0) {
		 reverse = reverse *10;
		 reverse = reverse + n%10;
		 n = n/10;
	 }
	 System.out.println(reverse);
 }
}

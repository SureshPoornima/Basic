package Logic_Building;
import java.util.Scanner;
public class Prime_Number {
 public static void main(String [] args) {
	int n;
	float sum = 0;
	 Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	 if (n==0 || n==1) {
		 System.out.println(n+" is not a prime number ");
	 }
	float m = n/2;
	 for(float i= 2; i<=m;i++) {
	 
	 if (n%i == 0) {
		 System.out.println("not a prime Number");
		 sum =  sum+ 1;
		 break;
	 }
	 else
	 {
		 System.out.println(" prime number");
		 sum = sum +1;
		 break;
	 }
 }
	 if (sum==0) {
		 System.out.println(n+" is prime number");
	 }
	 }
}

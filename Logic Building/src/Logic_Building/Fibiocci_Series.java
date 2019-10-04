package Logic_Building;
import java.util.Scanner;
public class Fibiocci_Series {

	public static void main(String []args) {
		int n;
		int t1 = 0; 
		int t2 = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("First "+ n + "terms");
		System.out.print(t1+",");
		System.out.print(t2);
		for(int i=0; i<=n; i++) {
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			System.out.print(","+sum );
		}
	}
}

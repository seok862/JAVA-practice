import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			double D = sc.nextDouble();
			
			double num1 = A/B;
			double num2 = C/D;
			if(num1 > num2) {
				System.out.println("#"+t+" ALICE");
			} else if( num1 < num2) {
				System.out.println("#"+t+" BOB");
			} else {
				System.out.println("#"+t+" DRAW");
			}
		}
	}
}

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int D = sc.nextInt();
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double F = sc.nextDouble();
			
			double ans = (D/(A+B))*F;
			
			System.out.printf("#%d %.6f\n",t,ans);
		}
	}
}

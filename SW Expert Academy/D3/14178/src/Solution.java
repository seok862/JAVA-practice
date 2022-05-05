import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			double N = sc.nextInt();
			
			double D = sc.nextInt();
			
			System.out.println("#"+t+" "+(int)Math.ceil(N/((D*2)+1)));
		}
	}
}

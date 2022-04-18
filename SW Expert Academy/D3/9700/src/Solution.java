import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			double p = sc.nextDouble();
			double q = sc.nextDouble();
			
			if(((1-p)*q) < (p*(1-q)*q)) {
				System.out.println("#"+t+" YES");
			} else {
				System.out.println("#"+t+" NO");
			}
		}
	}
}

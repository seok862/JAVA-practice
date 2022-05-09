import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			double sum = 0;
			
			for(int i=0; i<N; i++) {
				double p = sc.nextDouble();
				int x  = sc.nextInt();
				
				sum += p*x;
			}
			System.out.printf("%.6f",sum);
		}
	}
}

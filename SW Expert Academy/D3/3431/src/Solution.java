import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1 ; t<=T; t++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			if(X < L) {
				System.out.println("#"+t+" "+(L-X));
			} else if(X > L && X < U) {
				System.out.println("#"+t+" 0");
			} else {
				System.out.println("#"+t+" -1");
			}
		}
	}
}

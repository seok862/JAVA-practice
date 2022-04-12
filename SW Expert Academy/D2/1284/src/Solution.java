import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int A = P*W;
			int B = 0;
			if(W<R) {
				B = Q;
			}
			if(W>R) {
				B = Q+(W-R)*S;
			}
			
			System.out.println("#"+t+" "+Math.min(A, B));
		}
	}
}

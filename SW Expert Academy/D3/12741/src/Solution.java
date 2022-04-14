import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			int ans = 0;
			
			int start = 0;
			int end = 0;
			
			if(A<C) {
				start = C;
			} else {
				start = A;
			}
			
			if(B<=D) {
				end = B;
			} else {
				end = D;
			}
			
			if(start < end) {
				ans = end-start;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			int cnt = 0;
			
			if(A==B && B!=C) {
				System.out.println("#"+t+" "+C);
			} else if(A!=B && A==C) {
				System.out.println("#"+t+" "+B);
			} else if(B==C && A!=C) {
				System.out.println("#"+t+" "+A);
			} else if( A==B && B==C) {
				System.out.println("#"+t+" "+A);
			}
		}
	}
}

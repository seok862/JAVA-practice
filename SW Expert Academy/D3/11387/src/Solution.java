import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int D = sc.nextInt();
			int L = sc.nextInt();
			int N = sc.nextInt();
			
			int ans = 0;
			
			for(int i=0; i<N; i++) {
				ans += D*(1+(i*(L*0.01)));
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

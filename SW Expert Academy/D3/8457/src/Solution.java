import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int E = sc.nextInt();
			
			int cnt = 0;
			for(int i=0; i<N; i++) {
				int num = sc.nextInt();
				
				int k=1;
				
				int ans = 0;
				
				while(ans <= B+E) {		
					
					k++;
					ans = num*k;
					
					if(ans >= B-E && ans <= B+E) {
						cnt++;
						break;
					}
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

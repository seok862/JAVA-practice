import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int cnt = 0;
			
			for(int i=1; i<=N; i++) {
				int sum = 0;
				
				for(int j=i; j<=N; j++) {
					sum += j;
					
					if(sum == N) {
						cnt++;
						break;
					}
					else if(sum > N) {
						break;
					}
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

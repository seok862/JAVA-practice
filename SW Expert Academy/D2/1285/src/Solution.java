import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int min = 100000;
			int cnt = 0;
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				
				if(Math.abs(a)<min) {
					min = Math.abs(a);
					cnt = 1;
					
				}
				
				else if(Math.abs(a) == min) {
					cnt++;
				}			
			}
			System.out.println("#"+t+" "+min+" "+cnt);
		}
	}
}

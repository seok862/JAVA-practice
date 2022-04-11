import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int ans = 100000;
			int cnt = 0;
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				
				if(a>0) {
					if(ans > a) {
						ans = a;
						cnt = 1;
					}
					if(ans == a) {
						cnt++;
					}
				}
				if(a<0) {
					if(ans > -a) {
						ans = a;
						cnt = 1;
					}
					if(ans == a) {
						cnt++;
					}
				}
				
			}
			System.out.println(ans+" "+cnt);
		}
	}
}

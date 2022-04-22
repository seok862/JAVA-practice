import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			
			int[] arr = new int[N];
			int cnt = 0;
			int num = 0;
			
			for(int i=0; i<N; i++) {
				int door = sc.nextInt();
				
				if(door == 1) {
					num = 0;
				} else {
					num++;
					if(num == D) {
						cnt++;
						num = 0;
					}
				}
			}
			
			System.out.println("#"+t+" "+cnt);
			
		}
	}
}

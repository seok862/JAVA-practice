import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			int[] dy = new int[N];
			
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			dy[0] = 1;
			int ans = 0;
			
			for(int i=1; i<N; i++) {
				int max = 0;
				
				
				for(int j=i-1; j>=0; j--) {
					if(arr[j] < arr[i] && dy[j] > max) {
						max = dy[j];
					}
					
					dy[i] = max + 1;
				}
				
				ans = Math.max(ans, dy[i]);
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

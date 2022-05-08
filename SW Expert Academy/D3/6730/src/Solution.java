import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int up = 0;
			int down = 0;
			
			int max_up = 0;
			int max_down = 0;
			
			for(int i=0; i<N-1; i++) {
				if(arr[i] > arr[i+1]) {
					down = arr[i]-arr[i+1];
					
					if(down > max_down) max_down = down;
				} else {
					up = arr[i+1]-arr[i];
					
					if(up > max_up) max_up = up;
				}
			}
			
			System.out.println("#"+t+" "+max_up+" "+max_down);
		}
	}
}

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
			
			int cnt = 0;
			
			for(int i=1; i<=N-2; i++) {
				if(arr[i-1] < arr[i] && arr[i] < arr[i+1]) {
					cnt++;
				}
				else if(arr[i-1] > arr[i] && arr[i] > arr[i+1]) {
					cnt++;
				}
			}		
			System.out.println("#"+t+" "+cnt);
		}
	}
}

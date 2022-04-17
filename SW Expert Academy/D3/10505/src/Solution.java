import java.util.Scanner;
public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int sum = 0;
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			int avg = sum/N;
			
			int cnt = 0;
			
			for(int i=0; i<N; i++) {
				if(arr[i] <= avg) {
					cnt++;
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}
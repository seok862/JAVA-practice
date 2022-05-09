import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			
			int[] arr = new int[N];
			
			for(int i=0; i<Q; i++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				
				for(int j=L-1; j<R; j++) {
					arr[j] = i+1;
				}
			}
			String ans ="";
					
			for(int i=0; i<N; i++) {
				ans += Integer.toString(arr[i]) + " ";
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

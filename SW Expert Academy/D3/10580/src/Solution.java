import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int[] left = new int[N];
			int[] right = new int[N];
			
			for(int i=0; i<N; i++) {
				left[i] = sc.nextInt();
				right[i] = sc.nextInt();
			}
			int cnt = 0;
			
			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<N; j++) {
					if((left[i] < left[j]) && right[i] > right[j]) cnt++;
					if((left[i] > left[j]) && right[i] < right[j]) cnt++;
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

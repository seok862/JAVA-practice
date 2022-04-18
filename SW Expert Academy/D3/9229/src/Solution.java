import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 0;
			int ans = 0;
			
			for(int i=0; i<N-1; i++) {
				for(int j=1+i; j<N; j++) {
					if(arr[i]+arr[j]<=M) {
						ans = arr[i]+arr[j];
						if(max<ans) {
							max = ans;
						}
					} else {
						ans = 0;
					}
				}
			}
			if(max == 0) {
				System.out.println("#"+t+" -1");
			} else {
				System.out.println("#"+t+" "+max);
			}
		}
	}
}

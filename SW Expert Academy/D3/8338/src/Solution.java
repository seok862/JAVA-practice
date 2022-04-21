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
			
			int ans = arr[0];
			
			for(int i=1; i<arr.length; i++) {
				if(ans == 1 || ans == 0) {
					ans += arr[i];
				} else {
					if(arr[i] == 1 || arr[i] == 0) {
						ans += arr[i];
					} else {
						ans *= arr[i];
					}
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

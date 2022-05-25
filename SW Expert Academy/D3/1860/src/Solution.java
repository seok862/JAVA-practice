import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			
			boolean check = true;
			
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i=0; i<N; i++) {
				int sum = K*(arr[i]/M);
				
				if(sum < i+1) {
					check = false;
					break;
				}
				
			}
			
			
			if(check) System.out.println("#"+t+" Possible");
			else System.out.println("#"+t+" Impossible");
		}
	}
}

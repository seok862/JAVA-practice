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
			
			int max = Integer.MIN_VALUE;
			int sum = 0;
			
			for(int i=0; i<N; i++) {
				sum += arr[i];
				
				if(sum > max) max = sum;
				if(sum < 0) sum = 0;
			}
				
			System.out.println("#"+t+" "+max);
		}
	}
}

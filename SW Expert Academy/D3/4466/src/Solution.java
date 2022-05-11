import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int sum = 0;
			
			for(int i = arr.length-1; i>= arr.length-K; i--) {
				sum += arr[i];
			}
			System.out.println("#"+t+" "+sum);
		}
	}
}

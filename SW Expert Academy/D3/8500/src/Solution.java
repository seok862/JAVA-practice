import java.util.Arrays;
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
			
			Arrays.sort(arr);
			
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				sum += arr[i]+1;
			}
			
			sum += arr[N-1];
			
			System.out.println("#"+t+" "+sum);
		}
	}
}

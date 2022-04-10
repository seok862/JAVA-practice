import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[10];
			int sum = 0;
			for(int i=0; i<10; i++){
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			Arrays.sort(arr);
			
			sum -= arr[0]+arr[9];
			double ans = sum/8;
			System.out.println("#"+t+" "+Math.round(ans));
		}
	}
}

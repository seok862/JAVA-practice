import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i=2; i<N-2; i++) {
				if(arr[i] > arr[i-1] && arr[i] > arr[i-2] && arr[i] > arr[i+1] && arr[i] > arr[i+2]) {
					int max = Math.max(Math.max(Math.max(arr[i-1], arr[i-2]), arr[i+1]), arr[i+2]);
					sum+= arr[i]-max;
				}
			}
			
			System.out.println("#"+t+" "+sum);
		}
	}
}

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			long[] arr = new long[101];
			arr[0] = 1;
			arr[1] = 1;
			arr[2] = 1;
			
			for(int i=3; i<101; i++) {
				arr[i] = arr[i-2]+arr[i-3];
			}
			
			int N = sc.nextInt();
			
			System.out.println("#"+t+" "+arr[N-1]);
		}
	}
}

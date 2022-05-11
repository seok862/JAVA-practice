import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			boolean[] check = new boolean[10001];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				check[arr[i]] = true;
			}
			
			for(int i=0; i<N-1; i++) {
				int num = arr[i]*10+arr[i+1];
				check[num] = true;
			}
			
			for(int i=0; i<N-2; i++) {
				int num = arr[i]*100+arr[i+1]*10+arr[i+2];
				check[num] = true;
			}
			int ans = 0;
			for(int i=0; i<10001; i++) {
				if(check[i] == false) {
					ans = i;
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

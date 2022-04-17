import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		Loop1 : for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int cnt = 1;
			int a = M;
			boolean sign = false;
			if(M == 0 || M<=8) {
				System.out.println("#"+t+" OFF");
				continue Loop1;
			}
			while(true) {
				a /= 2;
				cnt++;
				
				if(a==1) {
					break;
				}
			}
		
			if(cnt<N) {
				System.out.println("#"+t+" OFF");
				continue Loop1;
			}
			
			int[] arr = new int[cnt];
			
			for(int i=cnt-1; i>=0; i--) {
				arr[i] = M%2;
				M = M/2;
			}
			
			for(int i=arr.length-1; i>arr.length-N+1; i--) {
				if(arr[i] == 1) {
					sign = true;
					
				} else {
					sign = false;
					break;
				}
			}
			
			if(sign) {
				System.out.println("#"+t+" ON");
			} else {
				System.out.println("#"+t+" OFF");
			}
		}
	}
}

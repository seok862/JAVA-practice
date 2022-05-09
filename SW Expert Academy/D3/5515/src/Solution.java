import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			int m = sc.nextInt();
			int d = sc.nextInt();
			
			int ans = 0;
			
			if(m == 1) {
				if(d%7 <4) {
					ans = d%7+3;
				} else {
					ans = d%7-4;
				}
			} else {
				for(int i=0; i<m-1; i++) {
					d += arr[i];
					
					if(d%7 <4) {
						ans = d%7+3;
					} else {
						ans = d%7-4;
					}
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			String ans = "OFF";
			boolean check = false;
			for(int i=0; i<N; i++) {
				int num = M%2;
				if(num == 0) {
					check = false;
					break;
				} else {
					check = true;
				}
				
				M /= 2;
			}
			
			if(check) ans="ON";
			else ans="OFF";
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

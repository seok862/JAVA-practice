import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			int cnt = 0;
			
			for(int i=0; i<str.length(); i++) {				
				if( str.charAt(i) == 'x') {
					cnt ++;
				}
			}
				System.out.println("#"+t+((cnt >= 8) ? " NO" : " YES"));
		}
	}
}

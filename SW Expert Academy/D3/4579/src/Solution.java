import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int len = st.length();
			
			boolean check = true;
			
			int left = 0;
			int right = len-1;
			
			String ans = "Exist";
			
			while(left <= right) {
				if(st.charAt(left) == '*' || st.charAt(right) == '*') break;
				if(st.charAt(left++) != st.charAt(right--)) {
					ans = "Not exist";
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

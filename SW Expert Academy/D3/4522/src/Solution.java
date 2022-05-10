import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int len = st.length();
			
			int left = 0;
			int right = len-1;
			
			String ans = "Exist";
			
			for(int i=0; i< len/2; i++) {
				if(st.charAt(i) == '?' || st.charAt(len-1-i) == '?') continue;
				if(st.charAt(i) != st.charAt(len-1-i)) {
				ans = "Not exist";
				break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

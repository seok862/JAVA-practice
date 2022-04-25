import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			int left = 0;
			int right = 0;
			String ans = "SAME";
			
			for(int i=0; i<str1.length(); i++) {
				if(str1.length() != str2.length()) {
					ans = "DIFF";
					break;
				}
				
				if(str1.charAt(i) == 'B') left=2;
				else if(str1.charAt(i) == 'A' || str1.charAt(i) == 'D' || str1.charAt(i) == 'P' || str1.charAt(i) == 'Q' || str1.charAt(i) == 'O' || str1.charAt(i) == 'R') {
					left = 1;
				}
				else {
					left = 0;
				}
				
				if(str2.charAt(i) == 'B') right=2;
				else if(str2.charAt(i) == 'A' || str2.charAt(i) == 'D' || str2.charAt(i) == 'P' || str2.charAt(i) == 'Q' || str2.charAt(i) == 'O' || str2.charAt(i) == 'R') {
					right = 1;
				}
				else {
					right = 0;
				}
				
				if(left != right) {
					ans = "DIFF";
					break;
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

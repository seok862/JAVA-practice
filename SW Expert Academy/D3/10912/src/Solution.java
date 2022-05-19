import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[26];
			String st = sc.next();
			
			for(int i=0; i<st.length(); i++) {
				arr[st.charAt(i)-97]++;
			}
			
			String ans = "";
			for(int i=0; i<26; i++) {
				
				if(arr[i]%2 != 0) {
					ans+=(char)(i+97);
				}
				
			}
			if(ans.isEmpty()) System.out.println("#"+t+" Good");
			else System.out.println("#"+t+" "+ans);
		}
	}
}

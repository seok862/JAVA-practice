import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			String[] arr = new String[st.length()+1];
			int H = sc.nextInt();
			
			arr[0] = "";
			
			for(int i=0; i<st.length(); i++) {
				arr[i+1] = st.substring(i, i+1);
			}
			
			
			
			for(int i=0; i<H; i++) {
				int N = sc.nextInt();
				
				arr[N] += "-";
			}
			
			String ans = "";
			
			for(int i=0; i<arr.length; i++) {
				ans += arr[i];
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

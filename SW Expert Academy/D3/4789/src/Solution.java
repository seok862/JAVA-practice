import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int people = 0;
			int cnt = 0;
			
			for(int i=0; i<st.length(); i++) {
				int tmp = Integer.parseInt(st.substring(i, i+1));
				if(people < i) {
					cnt += i-people;
					people = i+tmp;
				} else people += tmp;
				
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

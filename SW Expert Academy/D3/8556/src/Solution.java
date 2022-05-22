import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			st = st.replaceAll("north", "n");
			st = st.replaceAll("west", "w");
			int ans = 0;
			int cnt = 0;
			
			String s = "";
			for(int i=st.length()-1; i>=0; i--) {
				
				int num = (int)Math.pow(2, cnt);
				
				if(st.substring(i, i+1).equals("w")) {
					if(ans == 0) ans = 90;
					else {
						ans = ans+(90/num);
						

					}
				}
				
				else if(st.substring(i, i+1).equals("n")) {
					if(ans == 0) continue;
					else {
						ans = ans-(90/num);
					}
				}
				
				cnt++;
			}
			
			System.out.println("#"+t+" "+ans);
		}	
	}
}

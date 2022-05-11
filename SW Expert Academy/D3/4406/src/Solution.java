import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			String ans ="";
			for(int i=0; i<st.length(); i++) {
				if(st.substring(i, i+1).equals("a") || st.substring(i, i+1).equals("e") || st.substring(i, i+1).equals("i")  || st.substring(i, i+1).equals("o") || st.substring(i, i+1).equals("u") ) {
					ans += "";
				} else {
					ans += st.substring(i, i+1);
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
		
	}
}

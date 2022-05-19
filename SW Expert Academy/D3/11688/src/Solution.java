import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int a = 1;
			int b = 1;
			
			for(int i=0; i<st.length(); i++) {
				if(st.substring(i, i+1).equals("L")) {
					b = a+b;
				} else {
					a = a+b;
				}
			}
			
			System.out.println("#"+t+" "+a+" "+b);
		}
	}
}

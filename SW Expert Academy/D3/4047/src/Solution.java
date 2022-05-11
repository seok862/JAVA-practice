import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			String[] arr = new String[1000];
			boolean sign = true;
			int plus = 0;
			int cnt = 0;
			
			for(int i=0; i<1000; i++) {
				arr[i] = st.substring(plus, plus+3);
				plus += 3;
				if(plus == st.length()) {
					cnt = i;
					break;
				}
			}
			
			String check = "";
			
			Loop : for(int i=0; i<cnt; i++) {
				check = arr[i];
				for(int j=i+1; j<=cnt; j++) {
					if(check.equals(arr[j])) {
						sign = false;
						break Loop;
					}
				}
			}
			String ans = "";
			
			if(sign) {
				int num = 13;
				
				for(int i=0; i<st.length(); i++) {
					if(st.substring(i, i+1).equals("S")) {
						num--;
					}
				}
				ans += num+" ";
				
				num = 13;
				
				for(int i=0; i<st.length(); i++) {
					if(st.substring(i, i+1).equals("D")) {
						num--;
					}
				}
				ans += num+" ";
				num = 13;
				
				for(int i=0; i<st.length(); i++) {
					if(st.substring(i, i+1).equals("H")) {
						num--;
					}
				}
				ans += num+" ";
				num = 13;
				
				for(int i=0; i<st.length(); i++) {
					if(st.substring(i, i+1).equals("C")) {
						num--;
					}
				}
				ans += num+" ";
				
				System.out.println("#"+t+" "+ans);
			} else {
				System.out.println("#"+t+" ERROR");
			}
		}
	}
}

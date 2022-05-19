import java.util.Scanner;
import java.math.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int cnt = st.length()-1;
			
			String str = st.substring(0, 3);
			
			double num = Integer.parseInt(str);
			
			num = Math.round(num/10);
			num /= 10;
			
			
			if(num == 10) {
				cnt++;
				num/=10;
				
			}
			
			System.out.println("#"+t+" "+num+"*10^"+cnt);
			
		}
	}
}

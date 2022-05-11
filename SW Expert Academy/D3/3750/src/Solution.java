import java.util.Scanner;
import java.math.BigInteger;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			BigInteger N = sc.nextBigInteger();
			String st = N.toString();
			
			int sum = 0;
			
			for(int i=0; i<st.length(); i++) {
				sum +=Integer.parseInt(st.substring(i, i+1));
			}
			
			int num = sum;
			
			while(num > 9) {
				
				sum = 0;
				st = Integer.toString(num);				
				for(int i=0; i<st.length(); i++) {
					sum += Integer.parseInt(st.substring(i, i+1));
				}
				
				num = sum;
			}
			
			System.out.println("#"+t+" "+num);
		}
	}
}

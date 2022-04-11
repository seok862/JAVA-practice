import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int num2 = 0;
			int num3 = 0;
			int num5 = 0;
			int num7 = 0;
			int num11 = 0;
			while(true) {
				if(N%2 == 0) {
					N = N/2;
					num2++;
				}
				if(N%3 == 0) {
					N = N/3;
					num3++;
				}
				if(N%5 == 0) {
					N = N/5;
					num5++;
				}
				if(N%7 == 0) {
					N = N/7;
					num7++;
				}
				if(N%11 == 0) {
					N = N/11;
					num11++;
				}
				if(N==1) break;
			}
			System.out.println("#"+t+" "+num2+" "+num3+" "+num5+" "+num7+" "+num11);
		}
	}
}

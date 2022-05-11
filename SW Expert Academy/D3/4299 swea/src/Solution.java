import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int D = sc.nextInt();
			int H = sc.nextInt();
			int M = sc.nextInt();
			
			int time = 11*1440+11*60+11;
			
			int sum = D*1440+H*60+M;
			
			if(sum > time) {
				System.out.println("#"+t+" "+(sum-time));
			} else if(sum == time) {
				System.out.println("#"+t+" 0");
			} else {
				System.out.println("#"+t+" -1");
			}
		}
	}
}

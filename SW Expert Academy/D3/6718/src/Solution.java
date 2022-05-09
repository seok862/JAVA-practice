import java.util.Scanner;
public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int d = sc.nextInt();
			
			int ans = 0;
			
			if(d<100) {
				ans = 0;
			} else if(d>=100 && d<1000) {
				ans = 1;
			} else if(d>=1000 && d<10000) {
				ans = 2;
			} else if(d>=10000 && d<100000) {
				ans = 3;
			} else if(d>=100000 && d<1000000) {
				ans = 4;
			} else {
				ans = 5;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

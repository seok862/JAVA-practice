import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int S = sc.nextInt()-1;
			int E = sc.nextInt()-1;
			int M = sc.nextInt()-1;
			
			
			while(true) {
				if(E%365 == S && E%29 == M) {
					System.out.println("#"+t+" "+(E+1));
					break;
				} else	E += 24;
			}
		}
	}
}

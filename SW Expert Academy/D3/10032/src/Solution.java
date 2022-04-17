import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			if(N%K == 0) {
				System.out.println("#"+t+" 0");
			} else {
				System.out.println("#"+t+" 1");
			}
		}
	}
}

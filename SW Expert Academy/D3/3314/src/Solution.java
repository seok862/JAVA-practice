import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int sum = 0;
			for(int i=0; i<5; i++) {
				int N = sc.nextInt();
				
				if(N < 40) {
					N = 40;
				}
				
				sum+=N;
			}
			
			System.out.println("#"+t+" "+sum/5);
		}
	}
}

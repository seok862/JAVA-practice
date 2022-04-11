import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int speed = 0;
			int ans = 0;
			
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				
				if(a == 1) {
					speed += sc.nextInt();	
				}
				else if(a == 2) {
					speed -= sc.nextInt();
					
				}
				
				if(speed<0) speed = 0;
				ans += speed;
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

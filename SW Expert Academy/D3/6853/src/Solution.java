import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int X_1 = sc.nextInt();
			int Y_1 = sc.nextInt();
			int X_2 = sc.nextInt();
			int Y_2 = sc.nextInt();
			
			int ans1 = 0;
			int ans2 = 0;
			int ans3 = 0;
			
			int N = sc.nextInt();
			
			for(int i=0; i<N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();		
				
				if((x < X_2 && x > X_1) && (y < Y_2 && y > Y_1)) {
					ans1++;
				} else if(x > X_2 || x < X_1 || y > Y_2 || y < Y_1) {
					ans3++;
				} else {
					ans2++;
				}
			}
			System.out.println("#"+t+" "+ans1+" "+ans2+" "+ans3);
		}
	}
}

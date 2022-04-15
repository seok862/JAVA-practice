import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			boolean sign = false;
			
			Loop1 : for(int i=1; i<10; i++) {
				for(int j=1; j<10; j++) {
					if(i*j == N) {
						sign = true;
						break Loop1;
					}
				}
			}
			
			if(sign) {
				System.out.println("#"+t+" Yes");
			} else {
				System.out.println("#"+t+" No");
			}
		}
	}
}

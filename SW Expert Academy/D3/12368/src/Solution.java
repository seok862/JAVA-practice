import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
	
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				if(A+B > 24) {
					System.out.println("#"+t+" "+(A+B-24));
				} else if(A+B == 24) {
					System.out.println("#"+t+" "+0);
				} else if(A+B<24) {
					System.out.println("#"+t+" "+(A+B));
				}
			
		}
	}
}

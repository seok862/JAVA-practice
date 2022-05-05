import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			System.out.println("#"+t);
			int N =sc.nextInt();
			

			String ans = "";
			
			for(int i=0; i<N; i++) {
				String st = sc.next();
				
				int num = sc.nextInt();
				
				for(int j=0; j<num; j++) {
					ans += st;
					if(ans.length() == 10) {
						System.out.println(ans);
						ans="";
					}
				}
				if(i == N-1) {
					System.out.println(ans);
				}				
			}
		}
	}
}

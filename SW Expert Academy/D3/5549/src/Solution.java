import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String N = sc.next();
			
			int num =Integer.parseInt(N.substring(N.length()-1, N.length())) ;
			
			if(num%2 == 0) {
				System.out.println("#"+t+" Even");
			} else {
				System.out.println("#"+t+" Odd");
			}
		}
	}
}

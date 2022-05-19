import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String P = sc.next();
			String Q = sc.next();
			
			if(Q.equals(P+"a")) System.out.println("#"+t+" N");
			else System.out.println("#"+t+" Y");
		}
	}
}

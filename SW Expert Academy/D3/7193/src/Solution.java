import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			String X = sc.next();
			
			int sum = 0;
			for(int i=0; i<X.length(); i++) {
				sum += Integer.parseInt(X.substring(i,i+1));
			}
			
			System.out.println("#"+t+" "+sum%(N-1));
		}
	}
}

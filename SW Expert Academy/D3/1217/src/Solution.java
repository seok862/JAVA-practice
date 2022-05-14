import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			sc.nextInt();
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int ans = 1;
			
			for(int i=0; i<M; i++) {
				ans *= N;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}

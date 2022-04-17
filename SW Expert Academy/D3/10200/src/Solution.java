import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int min = 0;
			int max = 0;
			
			if(A+B <= N) {
				min = 0;
			} else {
				min = (A+B)-N;
			}
			
			if(A>B) {
				max = B;
			} else {
				max = A;
			}
			
			System.out.println("#"+t+" "+max+" "+min);
		}
	}
}

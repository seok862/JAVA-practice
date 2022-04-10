import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int num = 50000;
			int num2 = 10000;
			
			System.out.println("#"+t);
			
			for(int j=0; j<4; j++) {
				System.out.print(N/num+" ");
				N = N%num;
				num /= 10;
				System.out.print(N/num2+" ");
				N = N%num2;
				num2 /= 10;
			}
			System.out.println();
		}
	}
}

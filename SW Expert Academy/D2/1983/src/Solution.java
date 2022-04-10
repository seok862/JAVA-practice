import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		
		for(int t=1; t<T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			double[] arr = new double[N+1];
			
			int cnt = 0;
			
			for(int i=1; i<=N; i++) {
				int first_test = sc.nextInt();
				int second_test = sc.nextInt();
				int assignment = sc.nextInt();
				
				arr[i] = 0.35*first_test + 0.45*second_test + 0.2*assignment;
			}
			
			for(int i=1; i<=N; i++) {
				if(arr[i] > arr[K]) {
					cnt++;
				}
				System.out.println(cnt);
			}
				
			System.out.println("#"+t+" "+grade[cnt/(N/10)]);
		}
	}
}
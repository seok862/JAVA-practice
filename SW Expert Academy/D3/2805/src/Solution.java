import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String st = sc.next();
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.substring(j, j+1));
				}
			}
			
			int sum = 0;
			
			for(int i=0; i<N/2; i++) {
				for(int j=N/2-i; j<=N/2+i; j++) {
					sum += arr[i][j];
				}
			}
			
			for(int i=N/2; i>=0; i-- ) {
				for(int j=N/2-i; j<=N/2+i; j++) {
					sum += arr[N-i-1][j];
				}
			}
			
			System.out.println("#"+t+" "+sum);
		}
	}
}

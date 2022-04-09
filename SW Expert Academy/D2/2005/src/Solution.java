import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			arr[0][0] = 1;
			
			for(int j=1; j<N; j++) {
				arr[j][0] = 1;
				arr[j][j] = 1;		
				for(int k=1; k<j; k++) {
					arr[j][k] = arr[j-1][k-1]+arr[j-1][k];
				}	
			}	
			System.out.println("#"+i+" ");
			
			for(int j=0; j<N; j++) {
				for(int k=0; k<=j; k++) {
					System.out.print(arr[j][k]+" ");
				}
				System.out.println();
			}	
		}
	}
}

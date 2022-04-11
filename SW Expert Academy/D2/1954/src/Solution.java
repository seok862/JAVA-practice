import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int a = 0;
			int b = 0;
				
			int num = 1;
			
			int c = N;
			for(int i=0; i<2*N-1; i++) {
				switch(i%4) {
				case 0:
					for(int j=0; j<c; j++) {
						arr[a][b] = num;
						b++;
						num++;
					}
					a++;
					b--;
					c--;
					
					break;
				
				case 1:
					for(int j=0; j<c; j++) {
						arr[a][b] = num;
						a++;
						num++;
					}
					a--;
					b--;
					
					
				break;
				
				case 2:
					for(int j=0; j<c; j++) {
						arr[a][b] = num;
						b--;
						num++;
					}
					a--;
					b++;
					
					c--;
					
					break;
					
				case 3:
					for(int j=0; j<c; j++) {
						arr[a][b] = num;
						a--;
						num++;
					}
					a++;
					b++;
					
					break;
				}
			}
			System.out.println("#"+t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

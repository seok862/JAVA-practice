import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			int x = 0;
			int y = 0;
			int num = 1;
			int f = N;
			
			for(int i=0; i<2*N-1; i++) {
				switch(i%4) {
				case 0 :
					for(int j=0; j<f; j++) {
						arr[y][x] = num;
						x++;
						num++;
					}
					x--;
					f--;
					y++;
					break;
					
				case 1 :
					for(int j=0; j<f; j++) {
						arr[y][x] = num;
						y++;
						num++;
					}
					y--;
					x--;
					break;
					
				case 2 :
					for(int j=0; j<f; j++) {
						arr[y][x] = num;
						x--;
						num++;
					}
					x++;
					y--;
					f--;
					break;
					
				case 3 :
					for(int j=0; j<f; j++) {
						arr[y][x] = num;
						y--;
						num++;
					}
					y++;
					x++;
					
					break;
					
				}
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}

import java.util.Scanner;
public class Solution{
public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] arr = new int[K][N];
			
			int num = 1;
			int a = 0;
			int b = 0;
			
			for(int i=0; i<N; i++) {
				switch(i%2) {
				
				case 0 : 
					for(int j=0; j<K; j++) {
						arr[a][b] = num;
						a++;
						num++;
					}
					a--;
					b++;
					break;
					
				case 1 :
					for(int j=0; j<K; j++) {
						arr[a][b] = num;
						a--;
						num++;
					}
					a++;
					b++;
					break;
				}
			}
			System.out.print("#"+t+" ");
			for(int i=0; i<K; i++) {
				int sum = 0;
				for(int j=0; j<N; j++) {
					sum += arr[i][j];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
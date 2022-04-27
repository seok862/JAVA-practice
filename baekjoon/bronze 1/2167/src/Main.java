import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();
		
		for(int i=0; i<K; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum = 0;
			
			for(int j=a-1; j<x; j++) {
				for(int k=b-1; k<y; k++) {
					sum += arr[j][k];
				}
			}
			
			System.out.println(sum);
		}
	}
}

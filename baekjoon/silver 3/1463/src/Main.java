import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][5];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean[][] ans = new boolean[N][N];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					if(j==k) continue;
					if(arr[j][i] == arr[k][i]) {
						ans[j][k] = true;
						ans[k][j] = true;
					}
				}
			}
		}
		
		int max = 0;
		int max_index = 0;
		
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=0; j<N; j++) {
				if(ans[i][j]) cnt++;
			}
			if(cnt > max) {
				max = cnt;
				max_index = i;
			}
		}
		
		System.out.println((max_index+1));
	}
}

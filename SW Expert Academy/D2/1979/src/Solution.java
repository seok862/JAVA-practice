import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[][] arr = new int[N][N];
			int ans = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				int colCheck = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 0) {
						if (colCheck == K) {
							ans++;
						}
						colCheck = 0;
					} else {
						colCheck += 1;
					}

				}
				if (colCheck == K) {
					ans++;
				}
			}

			for (int i = 0; i < N; i++) {
				int rowCheck = 0;
				for (int j = 0; j < N; j++) {
					if (arr[j][i] == 0) {
						if (rowCheck == K) {
							ans++;
						}
						rowCheck = 0;
					} else {
						rowCheck += 1;
					}

				}
				if (rowCheck == K) {
					ans++;
				}
			}
			System.out.println("#" + t + " " + ans);
		}
	}
}

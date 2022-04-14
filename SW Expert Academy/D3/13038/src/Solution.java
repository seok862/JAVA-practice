import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[7];

			for (int i = 0; i < 7; i++) {
				arr[i] = sc.nextInt();
			}

			int ans = Integer.MAX_VALUE;

			for (int i = 0; i < 7; i++) {
				if(arr[i] == 1) {
					int start = i;
					int check = 0;
					int cnt = 0;

					while (true) {
						if (arr[start % 7] == 1) {
							check++;
						}

						cnt++;
						start++;

						if (check == N) {
							break;
						}
					}
					ans = Math.min(ans, cnt);
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

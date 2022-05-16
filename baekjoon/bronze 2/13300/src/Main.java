import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] M_arr = new int[7];
		int[] W_arr = new int[7];
		
		for(int i=0; i<N; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();
			
			if(gender == 1) {
				M_arr[grade]++;
			} else {
				W_arr[grade]++;
			}
		}
		
		int cnt = 12;
		
		for(int i=1; i<=6; i++) {
			if(M_arr[i] > K) {
				while(M_arr[i]>K) {
					cnt++;
					M_arr[i] -= K;
				}
			} else if(M_arr[i] == 0) {
				cnt--;
			}
			
			if(W_arr[i] > K) {
				while(W_arr[i]>K) {
					cnt++;
					W_arr[i] -= K;
				}
			} else if(W_arr[i] == 0) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
	}
}

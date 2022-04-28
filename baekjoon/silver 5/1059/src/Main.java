import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		
		int left = 0;
		int right = 1001;
		
		for(int i=0; i<N; i++) {
			if(arr[i] < n) {
				if(left < arr[i]) {
					left = arr[i];
				}
			} else if(arr[i] > n) {
				if(right > arr[i]) {
					right = arr[i];
				}
			} else {
				System.out.println(0);
				System.exit(0);
			}
		}
		 
		int cnt = 0;
		
		for(int i = left + 1; i <= n; i++) {
			for(int j = n; j <= right - 1; j++) {
				if(i != j) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

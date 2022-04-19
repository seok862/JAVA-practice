import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int t=0; t<C; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i=0; i<N; i++) {
				sum += arr[i];
			}
			
			int avg = sum/N;
			double per = 0;
			double cnt = 0;
			
			for(int i=0; i<N; i++) {
				if(arr[i] > avg) {
					cnt++;
				}
			}
			
			per = cnt/N;

			System.out.printf("%.3f%%%n",per*100);
		}
	}
}

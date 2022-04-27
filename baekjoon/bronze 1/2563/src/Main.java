import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[100][100];
		
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			for(int j=A; j<A+10; j++) {
				for(int k=B; k<B+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

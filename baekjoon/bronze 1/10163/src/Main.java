import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			for(int j=a; j<a+c; j++) {
				for(int k=b; k<b+d; k++) {
					arr[j][k] = i;
				}
			}
		}
		
		for(int i=1; i<=N; i++) {
			int cnt = 0;
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					if(arr[j][k] == i) cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
	}
}

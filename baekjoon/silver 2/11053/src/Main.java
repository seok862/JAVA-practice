import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int[] dy = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dy[0] = 1;
		
		for(int i=1; i<N; i++) {
			dy[i] = 1;
			
			for(int j=0; j < i; j++) {
				if(arr[j] < arr[i] && dy[i] < dy[j]+1) {
					dy[i] = dy[j]+1;
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			max = Math.max(max, dy[i]);
		}
		System.out.println(max);
	}
}

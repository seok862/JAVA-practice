import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int num = 0;
		int ans = 0;
		int max = 0;
		
		for(int i=0; i<N-2; i++) {
			for(int j=1+i; j<N-1; j++) {
				for(int k=1+j; k<N; k++) {
					num = arr[i]+arr[j]+arr[k];
					
					if(num <= M) {
						ans = num;
					}
					
					max = Math.max(ans, max);
				}
			}
		}
		System.out.println(max);
	}
}

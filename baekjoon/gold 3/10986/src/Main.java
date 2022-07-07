import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] sum = new long[N];
		sum[0] = sc.nextInt();
		
		for(int i = 1; i<N; i++) {
			sum[i] = sum[i-1]+sc.nextInt();
		}
		
		long[] arr = new long[M];
		
		long result = 0 ;
		
		for(int i=0; i<N; i++) {
			int num = (int)(sum[i]%M);
			arr[num]++;
			
			if(num == 0) result++;
		}
		
		
		for(int i=0; i<M; i++) {
			if(arr[i] > 1) {
				result += arr[i]*(arr[i]-1)/2;
			}
		}
		
		System.out.println(result);
	}
}

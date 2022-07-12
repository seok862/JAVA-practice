import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			int p = i;
			int v = arr[i];
			
			for(int j=i-1; j>=0; j--) {
				if(arr[j] < arr[i]) {
					p = j+1;
					break;
				}
				
				if(j == 0) {
					p = 0;
				}
			}
			
			for(int j=i; j>p; j--) {
				arr[j] = arr[j-1];
			}
			
			arr[p] = v;
		}
		
		int[] sum = new int[N];
		
		sum[0] = arr[0];
		for(int i=1; i<N; i++) {
			sum[i] = sum[i-1]+arr[i];
		}
		
		int result = 0;
		
		for(int i=0; i<N; i++) {
			result += sum[i];
		}
		
		System.out.println(result);
	}

}

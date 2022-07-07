import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] arr = new long[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			int st = 0;
			int end = N-1;
			long k = arr[i];
			
			while(st < end) {
				if(arr[end] + arr[st] == k) {
					if(end != i && st != i) {
						result++;
						break;
					} else if(st == i) {
						st++;
					} else if(end == i) {
						end--;
					}
				} else if(arr[end] + arr[st] > k) {
					end--;
				} else {
					st++;
				}
			}
		}
		
		System.out.println(result);
	}
}

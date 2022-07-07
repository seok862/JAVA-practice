import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int st = 0;
		int end = N-1;
		int result = 0;
		
		while(st < end) {
			if(arr[st] + arr[end] == M) {
				result++;
				st++;
				end--;
			}
			else if(arr[st] + arr[end] > M) {
				end--;
			} else {
				st++;
			}
		}
		
		System.out.println(result);
	}
}

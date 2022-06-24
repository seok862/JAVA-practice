import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[11];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		for(int i=3; i<11; i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			
			System.out.println(arr[num-1]);
		}
	}
}

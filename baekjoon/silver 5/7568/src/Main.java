import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int cnt = 1;
			for(int j=0; j<N; j++) {
				if(arr1[i] < arr1[j] && arr2[i] < arr2[j]) cnt++;
			}
			
			System.out.print(cnt+" ");
		}
	}
}

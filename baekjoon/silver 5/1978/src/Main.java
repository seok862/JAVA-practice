import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean[] check = new boolean[1001];
		
		check[0] = true;
		check[1] = true;
		
		for(int i=2; i<Math.sqrt(1001); i++) {
			for(int j=i*2; j<1001; j+=i) {
				if(!check[j]) check[j] = true;
			}
		}
		
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(!check[arr[i]]) cnt++;
		}
		
		System.out.println(cnt);
	}
}

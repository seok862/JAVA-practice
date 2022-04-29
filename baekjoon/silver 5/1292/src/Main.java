import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int[] arr = new int[1001];
		
		int cnt = 1;
		
		for(int i=1; i<=1000; i++) {
			for(int j=0; j<i; j++) {
				if(cnt == 1001) break;
				arr[cnt] = i;
				cnt++;
			}
		}
		
		int sum = 0;
		
		for(int i=A; i<=B; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
}

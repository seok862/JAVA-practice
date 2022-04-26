import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int N = 1;
		
		Loop1 : while(true) {
			int cnt = 0;
			for(int i=0; i<5; i++) {
				
				if(N%arr[i] == 0) {
					cnt++;
				}
				
				
				if(cnt >= 3) {
					break Loop1;
				}
			}
			N++;
		}
		
		System.out.println(N);
	}
}

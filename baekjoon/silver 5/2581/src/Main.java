import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int num = 0;
		
		
		for(int i=M; i<=N; i++) {
			boolean check = true;
			if(i == 1) continue;			

			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			
			if(check) {
				sum += i;
				num = i;
				
				min = Math.min(num, min);
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}

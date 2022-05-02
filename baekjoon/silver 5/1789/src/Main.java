import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		int cnt = 0;
		long sum = 0;
		long i=1;
		
		while(sum<=N) {
			sum += i;
			cnt++;
			i++;
		}
		
		System.out.println(cnt-1);
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 1;
		int n = 10;
		int len = 0;
		
		for(int i=1; i<=N; i++) {
			if(i%n == 0) {
				n*=10;
				cnt++;
			}
			
			len += cnt;
		}
		
		System.out.println(len);
	}
}

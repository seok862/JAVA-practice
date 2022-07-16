import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(count(N));
	}
	
	static int count(int N) {
		if(N < 100) {
			return N;
		}
		
		int cnt = 99;
		for(int i=100; i<=N; i++) {
				
			int H = i/100;
			int T = (i/10)%10;
			int O = i%10;
			
			if(H-T == T-O) {
				cnt++;
			}
		}
		
		return cnt;	
	}

}

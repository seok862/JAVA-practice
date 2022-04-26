import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 운동을 하려는 시간
		int m = sc.nextInt();	// 초기 맥박
		int M = sc.nextInt();	// 최대 맥박(넘지 말아야하는 맥박)
		int T = sc.nextInt();	// 증가하는 맥박
		int R = sc.nextInt();	// 휴식할때 감소하는 맥박
		
		int ex_time = 0;
		int rest_time = 0;
		int now = m;
		
		
		while(true) {
			if(m+T > M) {
				System.out.println("-1");
				break;
			}
			
			if(now+T <= M) {
				now = now+T;
				ex_time++;
			} else {
				now = now-R;
				if(now < m) {
					now = m;
				}
				rest_time++;
			}
			
			if(ex_time == N) {
				System.out.println(ex_time+rest_time);
				break;
			}
		}
	}
}

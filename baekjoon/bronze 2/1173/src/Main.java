import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// ��� �Ϸ��� �ð�
		int m = sc.nextInt();	// �ʱ� �ƹ�
		int M = sc.nextInt();	// �ִ� �ƹ�(���� ���ƾ��ϴ� �ƹ�)
		int T = sc.nextInt();	// �����ϴ� �ƹ�
		int R = sc.nextInt();	// �޽��Ҷ� �����ϴ� �ƹ�
		
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

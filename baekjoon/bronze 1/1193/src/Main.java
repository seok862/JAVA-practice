import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int cross_cnt = 1;
		int cnt = 0;
		
		while(true) {
			if(X<=cnt+cross_cnt) {
				if(cross_cnt % 2 == 1) {
					System.out.println(cross_cnt - (X-cnt-1)+"/"+(X-cnt));
					break;
				}
				
				else {
					System.out.println((X-cnt)+"/"+(cross_cnt-(X-cnt-1)));
					break;
				}
				
			}else {
				cnt += cross_cnt;
				cross_cnt++;
			}			
		}
	}
}

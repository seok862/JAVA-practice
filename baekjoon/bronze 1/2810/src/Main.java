import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String st = sc.next();
		
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			if(st.charAt(i) == 'L') {
				cnt++;
			}
		}
		if(cnt>0) {
			System.out.println((N+1)-(cnt/2));
		}
		else System.out.println(N);
		
	}
}

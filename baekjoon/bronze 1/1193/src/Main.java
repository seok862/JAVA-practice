import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int cnt = 1;
		int plus = A;
		
		while(A<V) {
			A = A-B;
			
			cnt++;
			A = A+plus;
			
			if(A>=V) {
				System.out.println(cnt);
				break;
			}
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int a = A;
			int b = B;
			while(true) {
				int r = a%b;
				
				a = b;
				b = r;
				
				if(b == 0) {
					break;
				}
			}
			System.out.println(A*B/a);
		}
	}
}

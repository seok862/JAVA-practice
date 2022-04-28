import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			double a = 1;
			double b = 1;
			
			for(double j=M; j>M-N; j--) {
				a = a*j;
			}
			
			for(double j=N; j>0; j--) {
				b = b*j;
			}
			
			System.out.printf("%.0f\n",a/b);
		}
	}
}

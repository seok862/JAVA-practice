import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int time = 0;
		if ( A < 0) {
			while(A < 0) {
				time += C;
				A++;
			}
			if ( A == 0) {
				time += D;
				A++;
			}
			if ( A >= 0) {
				while(A >= 0) {
					time += E;
					if ( A == B) {
						break;
					}
					++A;
				}			
			}
		}
		
		if ( A >= 0) {
			while(A >= 0) {
				if ( A == B) {
					break;
				}
				time += E;
				++A;
			}			
		}
		System.out.println(time);
		
	}
}

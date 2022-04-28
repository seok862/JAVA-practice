import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt(); 
			
			int max = 0;
			int min = 0;
			int N = 1;
			while(true) {
				if(N%a == 0 && N%b == 0) {
					min = N;
					N = 1;
					break;
				}
				
				N++;
			}
			
			for(int j=0; j<Math.max(a, b); j++) {
				if(a%N == 0 && b%N == 0) {
					max = N;
				}
				N++;
			}
			
			System.out.println(min+" "+max);
		}
	}
}

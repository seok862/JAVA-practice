import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			boolean flag = false;
			
			for(int i=x; i<M*N; i+=N) {				
				if(i%M == y) {
					System.out.println(i+1);
					flag = true;
					break;
				}	
			}
			
			if(!flag) System.out.println(-1);
		}
	}
}

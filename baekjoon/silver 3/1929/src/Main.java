import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		boolean[] check = new boolean[M+1];
		
		check[0] = true;
		check[1] = true;
		
		for(int i=2; i<Math.sqrt(M); i++) {
			for(int j=i*2; j<M+1; j += i) {
				check[j] = true;
			}
		}
		
		for(int i=N; i<M+1; i++) {
			if(!check[i]) System.out.println(i);
		}
	}
}

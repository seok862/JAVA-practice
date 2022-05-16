import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=N; i++) {
			list.add(sc.nextInt(), i);
		}
		
		for(int i=N-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}

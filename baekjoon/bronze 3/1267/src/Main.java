import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int Y = 0;
		int M = 0;
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
			Y += 10+arr[i]/30*10;
			M += 15+arr[i]/60*15;
		}
		if (Y>M) {
			System.out.println("M "+M);
		} else if(Y<M) {
			System.out.println("Y "+Y);
		} else {
			System.out.println("Y M "+M);
		}
		
	}
}

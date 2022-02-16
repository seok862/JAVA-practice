import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
			if(arr[i] == N) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}

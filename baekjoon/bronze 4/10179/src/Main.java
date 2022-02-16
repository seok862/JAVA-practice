import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		Double[] arr = new Double[A];
		for(int i=0; i<A; i++) {
			arr[i] = sc.nextDouble();
			arr[i] *= 0.8;
			System.out.println(String.format("$"+"%.2f",arr[i]));
		}
	}
}
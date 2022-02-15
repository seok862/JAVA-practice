import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[2];
		for (int i = 0; i<3; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i<2; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1[0]+arr2[0]-50);
	}
}

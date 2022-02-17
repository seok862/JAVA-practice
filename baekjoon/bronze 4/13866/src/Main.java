import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i=0;i<4;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		if (arr[0]+arr[3] >= arr[1]+arr[2]) {
			System.out.println((arr[0]+arr[3])-(arr[1]+arr[2]));
		} else if (arr[0]+arr[3] < arr[1]+arr[2]) {
			System.out.println((arr[1]+arr[2])-(arr[0]+arr[3]));
		}
	}
}

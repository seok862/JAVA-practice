import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		for(int i = 0; i<4; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr[2] = arr[2]-arr[0];
		arr[3] = arr[3]-arr[1];
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
	}
}

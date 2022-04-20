import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		int[] arr = new int[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}

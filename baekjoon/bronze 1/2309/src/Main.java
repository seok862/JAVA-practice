import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		int A = 0;
		int B = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-(arr[i]+arr[j]) == 100) {
			
					A = i;
					B = j;
					break;
				}	
			}
		}		
		
		for(int i=0; i<9; i++) {
			if(i == A || i == B) continue;
			
			System.out.println(arr[i]);
		}
	}
}

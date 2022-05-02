import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		int[] num = new int[8];
		
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
			num[i] = arr[i];
		}
		
		
		int[] max = new int[5];
		int cnt = 0;
				
		int sum = 0;
		
		Arrays.sort(arr);
		
		for(int i=3; i<8; i++) {
			max[cnt] = arr[i];
			sum += max[cnt];
			cnt++;
		}
		System.out.println(sum);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<5; j++) {
				if(num[i] == max[j]) {
					System.out.print(i+1+" ");
				}
			}
		}
	}
}

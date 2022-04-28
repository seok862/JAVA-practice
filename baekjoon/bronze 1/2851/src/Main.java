import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			sum += sc.nextInt();
			arr[i] = sum;
		}
		
		for(int i=1; i<10; i++) {
			if(arr[i] >= 100) {
				if(Math.abs(arr[i]-100) <= Math.abs(arr[i-1]-100)) {
					System.out.println(arr[i]);
					break;
				} else {
					System.out.println(arr[i-1]);
					break;
				}
			}
		}
		
		if(arr[9] < 100) {
			System.out.println(arr[9]);
		}
	}
}

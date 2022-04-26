import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		int[] arr = new int[81];
		for(int i=1; i<=S1; i++) {
			for(int j=1; j<=S2; j++) {
				for(int k=1; k<=S3; k++) {
					arr[i+j+k]++;
				}
			}
		}
		
		int max = 0;
		
		for(int i=0; i<81; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<81; i++) {
			if(arr[i] == max) {
				System.out.println(i);
				break;
			}
		}
	}
}

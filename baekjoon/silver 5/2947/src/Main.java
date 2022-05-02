import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(true) {
			if(arr[0] > arr[1]) {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			if(arr[1] > arr[2]) {
				int tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			if(arr[2] > arr[3]) {
				int tmp = arr[2];
				arr[2] = arr[3];
				arr[3] = tmp;
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			if(arr[3] > arr[4]) {
				int tmp = arr[3];
				arr[3] = arr[4];
				arr[4] = tmp;
				
				for(int i=0; i<5; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			
			if(arr[0] == 1 &&arr[1] == 2 &&arr[2] == 3 &&arr[3] == 4 &&arr[4] == 5) {
				break;
			}
			
		}
	}
}

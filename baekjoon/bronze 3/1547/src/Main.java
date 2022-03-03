import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[] arr = {1,0,0};
		for (int i=0; i<M; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int temp = 0;
			temp = arr[X-1];
			arr[X-1] = arr[Y-1];
			arr[Y-1] = temp;
		}
		if(arr[0] == 1) {
			System.out.println("1");
		} else if(arr[1] == 1) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}
}

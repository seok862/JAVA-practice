import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] arr = {A,B,C};
		int max = arr[0];
		if (A == B) {
			if(A==C) {
				System.out.println(10000+A*1000);
			}
			if(A!=C) {
				System.out.println(1000+A*100);
			}
		}

		if (A!=B) {
			if(A==C) {
				System.out.println(1000+A*100);
			}
			if(A != C) {
				if(B==C) {
					System.out.println(1000+B*100);
				}else {
					for(int i = 0; i<arr.length; i++) {
						if(arr[i]>max) {
							max = arr[i];
						}
					}
					System.out.println(max*100);
				}
			}
		}
	}
}

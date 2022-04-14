import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[11];
			int[] a = {2,3,5,7,11};
			while(true){
				if(N==1)
					break;
				
				for(int i=0; i<5; i++) {
					if(N%a[i] == 0) {
						arr[i]++;
						N /= a[i];
					}
				}
			}
			System.out.print("#"+t+" ");
			for(int i=0; i<5; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}

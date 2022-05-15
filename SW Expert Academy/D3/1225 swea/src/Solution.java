import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			sc.nextInt();
			
			int[] arr = new int[8];
			
			for(int i=0; i<8; i++) {
				arr[i] = sc.nextInt();
			}
			int num = 1;
			
			while(true) {
				int tmp = arr[0];				
				for(int i=0; i<7; i++) {
					arr[i] = arr[i+1];
				}
				
				arr[7] = tmp-num;
				num++;
				
				if(num == 6) num = 1;
				
				if(arr[7] <= 0) {
					arr[7] = 0;
					break;
				}
			}
			
			System.out.print("#"+t+" ");
			
			for(int i=0; i<8; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int N = sc.nextInt();
			
			int[] arr = new int[100];
			
			for(int i=0; i<100; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				int max_index = 0;
				int min_index = 0;
				
				for(int j=0; j<100; j++) {
					if(arr[j] > max) {
						max = arr[j];
						max_index = j;
					}
					
					if(arr[j] < min) {
						min = arr[j];
						min_index = j;
					}
				}
				
				arr[max_index]--;
				arr[min_index]++;
			}
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i=0; i<100; i++) {

				if(arr[i] > max) {
					max = arr[i];
				}
				
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
			System.out.println("#"+t+" "+(max-min));
		}
	}
}

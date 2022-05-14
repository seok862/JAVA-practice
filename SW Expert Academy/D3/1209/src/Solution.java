import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		for(int t=1; t<=10; t++) {
			
			sc.nextInt();
			
			int[][] arr = new int[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<100; i++) {
				int sum = 0;
				
				for(int j=0; j<100; j++) {
					sum += arr[i][j];
				}
				
				if(sum > max) max = sum;
			}
			
			for(int i=0; i<100; i++) {
				int sum = 0;
				
				for(int j=0; j<100; j++) {
					sum += arr[j][i];
				}
				
				if(sum > max) max = sum;
			}
			
			for(int i=0; i<100; i++) {
				int sum = 0;
				
				sum += arr[i][i];
				
				if(sum > max) max = sum;
			}
			
			for(int i=0; i<100; i++) {
				int sum = 0;
				
				sum += arr[i][99-i];
				
				if(sum > max) max = sum;
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}

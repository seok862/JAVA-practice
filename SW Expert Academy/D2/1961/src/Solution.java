import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[][] rotation_90 = Rotation(arr);
			int[][] rotation_180 = Rotation(rotation_90);
			int[][] rotation_270 = Rotation(rotation_180);
			
			System.out.println("#"+t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(rotation_90[i][j]);
				}
				System.out.print(" ");
				
				
				for(int j=0; j<N; j++) {
					System.out.print(rotation_180[i][j]);
				
				}
				System.out.print(" ");

				for(int j=0; j<N; j++) {
					System.out.print(rotation_270[i][j]);
				}
				System.out.println();
			}
		}	
	}
	
	public static int[][] Rotation(int[][] arr){
		int[][] temp = new int[arr.length][arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				temp[i][j] = arr[arr.length-1-j][i];
			}
		}
		
		return temp;
	}
}

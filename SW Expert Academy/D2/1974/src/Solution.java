import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[][] arr = new int[9][9];
			int ans = 1;
			for(int i=0; i<9; i++) {
				int sum = 0;
				
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
					sum += arr[i][j];
				}
				
				if(sum != 45) {
					ans = 0;
				}
			}
			
			for(int i=0; i<9; i++) {
				int sum = 0;
				for(int j=0; j<9; j++) {
					sum += arr[j][i];
				}
				if(sum != 45) {
					ans = 0;
				}
			}
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					int sum = 0;
					for(int k=0; k<3; k++) {
						for(int l=0; l<3; l++){
							sum += arr[3*i+k][3*j+l];
						}
					}
					if(sum != 45) {
						ans =0;
					}
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

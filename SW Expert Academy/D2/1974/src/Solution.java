import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[][] arr = new int[9][9];
			boolean sign = true;
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<9; i++) {
				int[] temp = new int[9];
				for(int j=0; j<9; j++) {
					temp[(arr[i][j])-1]++; 
				}
				for(int a=0; a<9; a++) {
					if(temp[a]==0) {
						sign = false;
						break;
					}
				}
			}
			
			for(int i=0; i<9; i++) {
				int[] temp = new int[9];
				for(int j=0; j<9; j++) {
					temp[arr[j][i]-1]++; 
				}
				for(int a=0; a<9; a++) {
					if(temp[a]==0) {
						sign = false;
						break;
					}
				}
			}
			
			for(int i=0; i<=6; i+=3) {
				for(int j=0; j<=6; j+=3) {
					int[] temp = new int[9];
					int row = i+3;
					int column = j+3;
					
					for(int a=i; a<row; a++) {
						for(int b=j; b<column; b++) {
							temp[(arr[a][b]-1)]++;
						}
					}
					for(int z=0; z<9; z++) {
						if(temp[z]==0) {
							sign = false;
							break;
						}
					}
				}
			}
			if(sign == true) {
				System.out.println("#"+t+" 1");
			} else {
				System.out.println("#"+t+" 0");
			}
			
		}
	}
}

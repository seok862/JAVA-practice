import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			char[][] arr = new char[N][N];
		
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<N; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			int row = 0;
			int col = 0;
			
			Loop2 : for(row=0; row<N; row++) {
				for(col=0; col<N; col++) {
					if(arr[row][col] == '#') {
						break Loop2;
					}
				}
			}
			
			int length = 0;
			int temp = row;
			while(temp < N) {
				if(arr[temp++][col]=='#') {
					length++;
				} else {
					break;
				}
			}
			
			boolean sign = true;
			Loop1 : for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i>= row && i <=row+length-1 && j >= col && j<= col+length-1) {
						if(arr[i][j] == '.') {
							sign = false;
							break Loop1;
						}
					}
					else {
						if(arr[i][j] =='#') {
							sign = false;
							break Loop1;
						}
					}
				}
			}
			System.out.println("#"+t+" "+(sign ? "yes" : "no"));	
		}
	}
}

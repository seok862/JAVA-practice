import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int len = sc.nextInt();
			
			String[][] arr = new String[8][8];
			
			for(int i=0; i<8; i++) {
				String st = sc.next();
				
				for(int j=0; j<8; j++) {
					arr[i][j] = st.substring(j, j+1);
				}
			}
			
			int cnt = 0;
			
			for(int i=0; i<8; i++) {
				
				for(int j=0; j<=8-len; j++) {
					boolean check = true;
					
					int left = j;
					int right = j+len-1;
					
					while(left<right) {
						if(!arr[i][left].equals(arr[i][right])) {
							check = false;
							break;
						}
						left++;
						right--;
					}
					
					if(check) {
						cnt++;
					}
				}
			}
			
			for(int i=0; i<8; i++) {
				
				for(int j=0; j<=8-len; j++) {
					boolean check = true;
					int left = j;
					int right = j+len-1;
					
					while(left<right) {
						if(!arr[left][i].equals(arr[right][i])) {
							check = false;
							break;
						}
						
						left++;
						right--;
					}
					
					if(check) cnt++;
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

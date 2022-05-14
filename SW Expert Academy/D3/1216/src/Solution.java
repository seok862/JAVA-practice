import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			sc.nextInt();
			
			for(int len = 50; len>=0; len++) {
				
			
			
			String[][] arr = new String[100][100];
			
			for(int i=0; i<100; i++) {
				String st = sc.next();
				
				for(int j=0; j<100; j++) {
					arr[i][j] = st.substring(j, j+1);
				}
			}
			
			int cnt = 0;
			
			for(int i=0; i<100; i++) {
				
				for(int j=0; j<=100-len; j++) {
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
			
			for(int i=0; i<100; i++) {
				
				for(int j=0; j<=100-len; j++) {
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
}

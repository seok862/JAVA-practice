import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String[][] arr = new String[5][15];
			
			for(int i=0; i<5; i++) {
				String st = sc.next();
				
				for(int j=0; j<st.length(); j++) {
					arr[i][j] = st.substring(j, j+1);
				}
			}
			String ans ="";
			for(int i=0; i<15; i++) {
				for(int j=0; j<5; j++) {
					if(arr[j][i] == null) {
						continue;
					} else {
						ans += arr[j][i];
					}
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}

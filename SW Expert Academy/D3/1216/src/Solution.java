import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int T = sc.nextInt();
			
			String[][] arr = new String[100][100];
			
			for(int i=0; i<100; i++) {
				String st = sc.next();
				for(int j=0; j<100; j++) {
					arr[i][j] = st.substring(j, j+1);
				}
			}
			
			int ans = 0;
			int max = 0;
			for(int N=100; N>=0; N--) {
				
				for(int i=0; i<100; i++) {
					for(int j=0; j<100-N+1; j++) {
						
						boolean check = true;
						int lt = j;
						int rt = j+N-1;
						
						while(lt<rt) {
							if(!arr[i][lt].equals(arr[i][rt])) {
								check = false;
								break ;
							}
							
							lt++;
							rt--;
							
						}
						
						if(check) ans = N;
						
						max = Math.max(ans, max);
					}
				}
				
				for(int i=0; i<100; i++) {
					for(int j=0; j<100-N+1; j++) {
						
						boolean check = true;
						int lt = j;
						int rt = j+N-1;
						
						while(lt<rt) {
							if(!arr[lt][i].equals(arr[rt][i])) {
								check = false;
								break ;
							}
							
							lt++;
							rt--;
							
						}
						
						if(check) ans = N;
						
						max = Math.max(ans, max);
					}
				}
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}

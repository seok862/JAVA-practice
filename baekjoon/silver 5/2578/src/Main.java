import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] num = new int[25];
		
		for(int i=0; i<25; i++) {
			num[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<25; i++) {
			int ans = 0;
			
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					if(arr[j][k] == num[i]) {
						
						arr[j][k] = 0;
					}
				}
			}
			
			
			
			for(int j=0; j<5; j++) {
				int cnt = 0;
				for(int k=0; k<5; k++) {
					if(arr[j][k] == 0) cnt++;
					
					if(cnt == 5) ans++;
				}
			}
			
			
			for(int j=0; j<5; j++) {
				int cnt = 0;
				for(int k=0; k<5; k++) {
					if(arr[k][j] == 0) cnt++;
					
					if(cnt == 5) ans++;
				}
			}
			int cnt = 0;
			
			for(int j=0; j<5; j++) {
				
				if(arr[j][j] == 0) cnt++;
								
				if(cnt == 5) ans++;
					
			}	
			
			
			cnt = 0;
			
			for(int j=0; j<5; j++) {
				
				if(arr[j][4-j] == 0) cnt++;
								
				if(cnt == 5) ans++;
					
			}	
			
			if(ans == 3) {
				System.out.println((i+1));
				break;
			}
		}	
	}
}

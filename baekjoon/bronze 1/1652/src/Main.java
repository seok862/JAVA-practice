import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[][] arr = new String[N][N];
		
		for(int i=0; i<N; i++) {
			String st = sc.next();
			for(int j=0; j<N; j++) {
				arr[i][j] = st.substring(j, j+1);
			}
		}
		int col = 0;
		int row = 0;
		
		for(int i=0; i<N; i++) {
			boolean check = true;
			int cnt = 0;
			for(int j=0; j<N; j++) {
				if(arr[i][j].equals(".")) {
					check = true;
					cnt++;
				} else {
					check = false;
					
					if(cnt >= 2) {
						row++;
					}
					
					cnt = 0;
				}
				
				if(j == N-1) {
					if(cnt >= 2) {
						row++;
					}
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			boolean check = true;
			int cnt = 0;
			for(int j=0; j<N; j++) {
				if(arr[j][i].equals(".")) {
					check = true;
					cnt++;
				} else {
					check = false;
					
					if(cnt >= 2) {
						col++;
					}
					
					cnt = 0;
				}
				
				if(j == N-1) {
					if(cnt >= 2) {
						col++;
					}
				}
			}
		}
		
		System.out.println(row+" "+col);
		
	}
}

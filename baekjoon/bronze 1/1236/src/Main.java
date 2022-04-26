import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] st = new char[N][M];
		
		int col = 0;
		int row = 0;
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<M; j++) {
				st[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<N; i++) {
			boolean check = true;
			for(int j=0; j<M; j++) {
				if(st[i][j] == 'X') {
					check = false;
					break;
				}
			}
			if(check) {
				row++;
			}
		}
		
		for(int i=0; i<M; i++) {
			boolean check = true;
			for(int j=0; j<N; j++) {
				if(st[j][i] == 'X') {
					check = false;
					break;
				}
			}

			if(check) {
				col++;
			}
		}
		
		System.out.println(Math.max(col, row));
	}
}

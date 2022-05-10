import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int D = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			boolean[] check = new boolean[B+1];
			
			check[0] = true;
			check[1] = true;
			
			for(int i=2; i <= Math.sqrt(B); i++) {
				for(int j = i*2; j<check.length; j = j+i) {
					check[j] = true;
				}
			}
			
			int cnt = 0;
			
			for(int i=A; i<B+1; i++) {
				if(check[i]) continue;
				if(Integer.toString(i).contains(Integer.toString(D))) cnt++;
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
}

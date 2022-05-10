import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int N = st.length();
			
			if(N == 1) {
				System.out.println("..#..");
				System.out.println(".#.#.");			
				System.out.println("#."+st+".#");
				System.out.println(".#.#.");	
				System.out.println("..#..");
			} else {
				
				for(int i=0; i<N; i++) {
					System.out.print("..#.");
				}
				System.out.println(".");
				
				for(int i=0; i<N; i++) {
					System.out.print(".#.#");
				}
				System.out.println(".");
				
				for(int i=0; i<N; i++) {
					System.out.print("#."+st.subSequence(i, i+1)+".");
				}
				System.out.println("#");
				
				for(int i=0; i<N; i++) {
					System.out.print(".#.#");
				}
				System.out.println(".");
				
				for(int i=0; i<N; i++) {
					System.out.print("..#.");
				}
				System.out.println(".");
			}			
		}
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int A = sc.nextInt();
			int[] arr1 = new int[A];
			
			for(int i=0; i<A; i++) {
				arr1[i] = sc.nextInt();
			}
			
			int B = sc.nextInt();
			int[] arr2= new int[B];
			
			for(int i=0; i<B; i++) {
				arr2[i] = sc.nextInt();
			}
			String ans="";
			for(int num = 4; num>=1; num--) {
				int A_cnt =0;
				int B_cnt =0;
				
				for(int i=0; i<A; i++) {
					if(arr1[i] == num) A_cnt++;
				}
				
				for(int i=0; i<B; i++) {
					if(arr2[i] == num) B_cnt++;
				}
				
				if(A_cnt == B_cnt) {
					if(num == 1) {
						ans ="D";
					}
				}
				else {
					if(A_cnt > B_cnt) {
						ans ="A";
						break;
					} else {
						ans ="B";
						break;
					}
				}
			}
			
			System.out.println(ans);
		}
	}
}

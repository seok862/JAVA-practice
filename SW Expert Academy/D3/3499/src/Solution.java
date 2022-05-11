import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			if(N%2 == 0) {
				String[] arr1 = new String[N/2];
				String[] arr2 = new String[N/2];
				
				for(int i=0; i<N/2; i++) {
					arr1[i] = sc.next();				
				}
				
				for(int i=0; i<N/2; i++) {
					arr2[i] = sc.next();
				}
				String ans = "";
				
				for(int i=0; i<N/2; i++) {
					ans+= arr1[i]+" ";
					ans+= arr2[i]+" ";
				}
				
				System.out.println("#"+t+" "+ans);
			} else {
				String[] arr1 = new String[(N/2)+1];
				String[] arr2 = new String[N/2];
				
				for(int i=0; i<(N/2)+1; i++) {
					arr1[i] = sc.next();				
				}
				
				for(int i=0; i<N/2; i++) {
					arr2[i] = sc.next();
				}
				String ans = "";
				
				for(int i=0; i<N/2; i++) {
					ans+= arr1[i]+" ";
					ans+= arr2[i]+" ";
				}
				
				ans+= arr1[N/2];
				System.out.println("#"+t+" "+ans);
			}
		}
	}
}

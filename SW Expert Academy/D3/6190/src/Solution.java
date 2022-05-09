import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			int ans = 0;
			int max = Integer.MIN_VALUE;
			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<N; j++) {
					
					String num =Integer.toString(arr[i]*arr[j]);
					
					boolean check = true;
					for(int k=0; k<num.length()-1; k++) {
						if(Integer.parseInt(num.substring(k,k+1)) <= Integer.parseInt(num.substring(k+1, k+2))) {
							check = true;
						} else {
							check = false;
							break;
						}
					}
					
					
					if(check) ans = Integer.parseInt(num);
					
					max = Math.max(ans, max);
				}
			}
			if(ans != 0) System.out.println("#"+t+" "+max);
			else System.out.println("#"+t+" -1");
			
		}
	}
}

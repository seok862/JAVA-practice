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
			
			int num = 0;
			int mix = 0;
			int ans = 0;
			int max = 0;
			boolean sign = true;
			String str;
			
			for(int i=0; i<N-1; i++) {
				num = arr[i];
				Loop1 : for(int j=1; j<N; j++) {
					mix = num*arr[j];
					str = Integer.toString(mix);
					
					for(int k=0; k<str.length()-1; k++) {
						if((str.charAt(k)-'0')+1 == str.charAt(k+1)-'0') {
							sign = true;
						}
						else {
							sign = false;
							continue Loop1;
						}
					}
					if(sign) {
						ans = mix;
						if(ans > max) {
							max = ans;
						}
					}
				}
			}
			
			if(max == 0) {
				System.out.println("#"+t+" -1");
			} else {
				System.out.println("#"+t+" "+max);			
			}
		}
	}
}

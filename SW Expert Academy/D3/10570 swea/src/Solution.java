import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int num = 1;
			int cnt = 0;
			while(num*num <= B) {
				if(num*num >= A) {
					
					
					String st = Integer.toString(num);
					
					boolean check = true;
					for(int i=0; i<st.length()/2; i++) {
						if(st.charAt(i) != st.charAt(st.length()-1-i)) check= false;
					}
					
					if(check) {
						String str = Integer.toString(num*num);
						
						boolean sign = true;
						for(int i=0; i<str.length()/2; i++) {
							if(str.charAt(i) != str.charAt(str.length()-1-i)) sign= false;
						}
						
						if(sign) cnt++;
					}
				}
				num++;
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}

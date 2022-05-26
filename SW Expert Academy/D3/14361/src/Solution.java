import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			String s = Integer.toString(N);
			int[] arr = new int[10];
			
			for(int i=0; i<s.length(); i++) {
				arr[Integer.parseInt(s.substring(i, i+1))]++;
			}
			
			int num = 2;
			boolean check = true;
			
			while(num <= 9) {
				check =true;
				int number = N;
				number *= num;
				
				int[] arr2= new int[10];
				String st = Integer.toString(number);
				
				for(int i=0; i<st.length(); i++) {
					arr2[Integer.parseInt(st.substring(i, i+1))]++;
				}
				
				
				for(int i=0; i<10; i++) {
					if(arr[i] != arr2[i]) {
						check = false;
						break;
					} 
				}
				
				if(check) break;
				num++;
			}
			
			if(check) System.out.println("#"+t+" possible");
			else System.out.println("#"+t+" impossible");
		}
	}
}

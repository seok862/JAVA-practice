import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=1; i<N; i++) {
				if(i == 1) list.add(arr[1]-arr[0]);
				else {
					int num = arr[i]-arr[0];
					boolean check = true;
					
					for(int j=0; j<list.size(); j++) {
						if(num%list.get(j) == 0) {
							check = false;
							break;
						}
					}
					
					if(check) list.add(num);
				}
			}
			System.out.println("#"+t+" "+list.size());
		}
	}
}

import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		for(int t=1; t<=10; t++) {
			int N =sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			String st = sc.next();
			
			for(int i=0; i<N; i++) {
				list.add(Integer.parseInt(st.substring(i, i+1)));
			}
			int num = 0;
			
			while(num<list.size()-1) {
				if(list.get(num) == list.get(num+1)) {
					list.remove(num);
					list.remove(num);
					
					num = 0;
				}
				else num++;				
			}
			
			System.out.print("#"+t+" ");
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		}
	}
}

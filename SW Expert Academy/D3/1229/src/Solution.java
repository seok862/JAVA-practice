import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int N = sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<N; i++) {
				list.add(sc.nextInt());
			}
			
			int num = sc.nextInt();
			
			for(int i=0; i<num; i++) {
				String st = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if(st.equals("I")) {
					for(int j=0; j<y; j++) {
						list.add(x, sc.nextInt());
						x++;
					}
				} else {
					for(int j=0; j<y; j++) {
						list.remove(x);
					}
				}
			}
			
			System.out.print("#"+t+" ");
			for(int i=0; i<10; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
	}
}

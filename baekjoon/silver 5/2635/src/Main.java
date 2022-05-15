import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> maxlist = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		
		int max = 0;
		
		for(int i=1; i<=N; i++) {
			ArrayList<Integer> nowlist = new ArrayList<Integer>();
			
			nowlist.add(N);
			nowlist.add(i);
			
			int num1 = N;
			int num2 = i;
			
			while(true) {
				int tmp = num1-num2;
				
				if(tmp >= 0) {
					nowlist.add(tmp);
				} else {
					break;
				}
				
				num1 = num2;
				num2 = tmp;
			}
			
			if(max < nowlist.size()) {
				max = nowlist.size();
				maxlist = nowlist;
			}
		}
		
		System.out.println(max);
		for(int i=0; i<maxlist.size(); i++) {
			System.out.print(maxlist.get(i)+" ");
		}
	}
}

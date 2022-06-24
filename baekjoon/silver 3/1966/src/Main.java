import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++) {
			// 1. 배열로 문서 중요도 받기;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				list.add(arr[i]);
			}
			int cnt = 0;
			
			while(true) {
				
				int max = 0;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i) > max) max = list.get(i);
				}
				
				int num = list.remove(0);
				
				if(num == max) {
					cnt++;
					if(M==0) break;
				} else {
					list.add(num);
				}
				
				M--;
				if(M < 0) {
					M = list.size()-1;
				}
				
				
			}
			
			System.out.println(cnt);
		}		
	}
}

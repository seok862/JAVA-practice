import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<N+1; i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			int n = q.poll();
			
			q.add(q.poll());			
		}
		
		System.out.println
		(q.poll());
	}
}
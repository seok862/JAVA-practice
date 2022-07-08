import java.util.*; 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int num = 1;
		
		boolean check = true;
		
		StringBuilder s = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<N; i++) {
			
			if(num <= arr[i]) {
				while(num <= arr[i]) {
					st.push(num++);
					s.append("+\n");
				}
				
				st.pop();
				s.append("-\n");
			}
			else {
				int n = st.pop();
				
				if(n > arr[i]) {
					System.out.println("NO");
					check = false;
					break;
				} else {
					s.append("-\n");
				}
			}
		}
		
		if(check) System.out.println(s.toString());
	}
}

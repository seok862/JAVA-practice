import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			String st = sc.next();
			
			Stack<String> stack = new Stack<String>();
			
			for(int j=0; j<st.length(); j++) {
				if(stack.size()==0) {
					stack.add(st.substring(j,j+1));
				} else {
					if(stack.peek().equals("(")) {
						if(st.substring(j,j+1).equals(")")) {
							stack.pop();
						} else {
							stack.add(st.substring(j, j+1));
						}
					} else {
						stack.add(st.substring(j, j+1));
					}
				}
			}
			
			if(stack.size()==0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

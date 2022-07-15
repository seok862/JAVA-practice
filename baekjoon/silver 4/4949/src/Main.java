import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String st = sc.nextLine();
			boolean check = true;
			if(st.equals(".")) break;
			else {
				Stack<String> stack = new Stack<>();
				
				for(int i=0; i<st.length(); i++) {
					String str = st.substring(i,i+1);
					if(str.equals("[") || str.equals("(")) stack.add(str);
					
					else if(str.equals("]")) {
						
						if(!stack.isEmpty() && stack.peek().equals("[")){ 
							stack.pop();
						}
						
						else {
							stack.add(str);
							check = false;
							break;
							
						}
					}
					
					else if(str.equals(")")) {
						
						if(!stack.isEmpty() && stack.peek().equals("(")){
							stack.pop();
						}
						
						else {
							stack.add(str);
							check = false;
							break;
						}
						
					}
				}
				if(stack.isEmpty()) check = true;
				else check = false;
				
				if(check) System.out.println("yes");
				else System.out.println("no");
			}
			
		}
	}
}

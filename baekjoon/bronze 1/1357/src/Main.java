import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String X = sc.next();
		String Y = sc.next();
		
		String Rev_X = "";
		String Rev_Y = "";
		
		for(int i=X.length(); i>0; i--) {
			Rev_X += X.substring(i-1,i);
		}
		
		for(int i=Y.length(); i>0; i--) {
			Rev_Y += Y.substring(i-1,i);
		}
		
	
		String add = Integer.toString(Integer.parseInt(Rev_X)+Integer.parseInt(Rev_Y));
		
		String ans = "";
		for(int i=add.length(); i>0; i--) {
			ans += add.substring(i-1,i);
		}
	
		System.out.println(Integer.parseInt(ans));
	}
}

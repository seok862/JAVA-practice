import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = sc.next();
		String st2 = sc.next();
		
		int ans = 0;
		for(int i=0; i<st1.length(); i++) {
			for(int j=0; j<st2.length(); j++) {
				ans += Integer.parseInt(st1.substring(i, i+1))*Integer.parseInt(st2.substring(j, j+1));
			}
		}
		
		System.out.println(ans);
	}
}

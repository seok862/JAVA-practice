import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			int prev = 0;
			
			for(int i=1; ; i++) {
				prev = (prev*10+1)%num;
				System.out.println(prev);
				if(prev == 0) {
					System.out.println("i: "+i);
					break;
				}
			}
		}
	}
}

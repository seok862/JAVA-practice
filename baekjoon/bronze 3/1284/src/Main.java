import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = 0;
			String N = sc.next();
			
			if(N.equals("0")) {
				break;
			}
			
			for(int i=0; i<N.length(); i++) {
				String a = N.substring(i, i+1);
				
				if (a.equals("0")) {
					count += 5;
				} else if (a.equals("1")) {
					count += 3;
				} else {
					count += 4;
				}
			}
			System.out.println(count+1);
		}
	}
}

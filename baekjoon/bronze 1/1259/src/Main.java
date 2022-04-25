import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String ans = "yes";
			int N = sc.nextInt();
			
			String str =  Integer.toString(N);
			
			if(N == 0) {
				break;
			}
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					ans = "no";
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
